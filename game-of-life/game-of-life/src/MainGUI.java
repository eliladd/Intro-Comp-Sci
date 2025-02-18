

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.Stack;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.Timer;

// Uncomment this line to make the code work using solution code provide in the lib folder
 //import sol.GameOfLifeFunctions;



public class MainGUI extends JFrame
{
    private static final String FASTEST = "5";
    private static final String FASTER = "4";
    private static final String MEDIUM = "3";
    private static final String SLOWER = "2";
    private static final String SLOWEST = "1";
    protected JPanel panel;
    protected final int MARGIN_SIZE = 0;
    protected int squareSize;
    protected int[][] cells;
    protected Stack<int[][]> undoStack = new Stack<int[][]>();
    protected int numRows;
    protected int numCols;
    protected Timer timer;
    protected int generation;
    protected JLabel generationLabel;
    
    /*
     * Methods to implement:
     * 
     * 
     * 
     */
    
    public static void main(String[] args) {
        //LifeGrid grid=new LifeGrid(50, 50, 15);
        MainGUI grid=new MainGUI(30, 30, 30);
    }
    
    public void start() {
        timer.setDelay(250);
        timer.start();
    }
    private void setDelay(int delay) {
        timer.setDelay(delay);
    }
    
    private void createTimer() {
        // Create timer for animation
        timer = new Timer(250, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                undoStack.push(GameOfLifeFunctions.copyCells(cells));
                cells = GameOfLifeFunctions.calculateNextGeneration(cells);
                generation++;
                generationLabel.setText("Generation: "+ generation);
                panel.repaint();
            }
        });
        timer.setRepeats(true);
        timer.setCoalesce(true);
        timer.setInitialDelay(0);
    }

    private void createPanel() {
        panel=new JPanel() {
            @Override
            public void paint(Graphics g) {
                super.paint(g);
                int offset=MARGIN_SIZE;
                //System.out.printf("%s ; %d %d\n", getPreferredSize(), squareSize*getNumRows(), squareSize*getNumCols());

                for(int y = 0; y < numRows; y++) {
                    int i=y;
                    for(int j = 0; j < numCols; j++) {
                        // first color the rectangle white
                        g.setColor(Color.WHITE);
                        g.fillRect(j * squareSize + offset, 
                                i * squareSize + offset, 
                                squareSize, 
                                squareSize);
                        if (cells[i][j]==1) {
                            g.setColor(Color.RED);
                            g.fillRect(j * squareSize + offset, 
                                    i * squareSize + offset, 
                                    squareSize, 
                                    squareSize);
                        }
                        g.setColor(Color.BLACK);
                        g.drawRect(j * squareSize + offset, 
                                i * squareSize + offset, 
                                squareSize, 
                                squareSize);
                    }
                }
            }
        };
        MouseAdapter mouseAdapter=new MouseAdapter() {
            int lastRow=-1;
            int lastCol=-1;
            
            @Override
            public void mousePressed(MouseEvent e) {
                int[] rowcol=convert(e.getX(), e.getY());
                int row=rowcol[0];
                int col=rowcol[1];
                if (e.getButton()==MouseEvent.BUTTON2) {
                    // on a right click, count the number of neighbors
                    int neighbors=GameOfLifeFunctions.getNumLiveNeighbors(cells, row, col);
                    String msg=String.format("%d live neighbors at row %d, col %d", neighbors, row, col);
                    System.out.println(msg);
                    
                            
                    return;
                } else if (e.getButton()==MouseEvent.BUTTON3){
                    int neighbors=GameOfLifeFunctions.getNumLiveNeighbors(cells, row, col);
                    String msg=String.format("%d live neighbors at row %d, col %d", neighbors, row, col);
                    System.out.println(msg);
                    
                    JOptionPane.showMessageDialog(null, msg);
                    
                    return;
                } else if (e.getButton()==MouseEvent.BUTTON1) {
                    setSquare(row, col);
                    lastRow=row;
                    lastCol=col;
                    //System.out.printf("(%d, %d) => (%d, %d)\n", e.getX(), e.getY(), rowcol[0], rowcol[1]);
                }
                
            }
            @Override
            public void mouseDragged(MouseEvent e) {
                int[][] copy=GameOfLifeFunctions.copyCells(cells);
                int[] rowcol=convert(e.getX(), e.getY());
                int row=rowcol[0];
                int col=rowcol[1];
                if ((lastRow!=row || lastCol!=col) && copy[row][col]==0 && cells[row][col]==0) {
                    setSquare(row, col);
                    //System.out.printf("DRAG: (%d, %d) => (%d, %d)\n", e.getX(), e.getY(), rowcol[0], rowcol[1]);
                    lastRow=row;
                    lastCol=col;
                }
            }
        };
        panel.addMouseListener(mouseAdapter);
        panel.addMouseMotionListener(mouseAdapter);
            
        panel.setPreferredSize(new Dimension(numCols*squareSize, numRows*squareSize));
        this.add(panel);
    }
    
    public MainGUI(int rows, int cols, int squareSize)
    {
        super("Game Of Life");
        this.numRows=rows;
        this.numCols=cols;
        this.squareSize=squareSize;
        this.cells=new int[rows][cols];
        createMenus();
        createPanel();
        createTimer();
        
        this.pack();
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //this.setContentPane(this);
        this.pack();
        this.setVisible(true);
        this.toFront();
        //frame.setAlwaysOnTop(false);
        
        this.addWindowListener(new WindowAdapter() {
            @Override public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        /*
        SwingUtilities.invokeLater(new Runnable() {
            public void run()
            {
                //Thread.currentThread().setPriority(10);
                createAndShowFrame();
            }
        });
        */
    }

    public MainGUI(int scale) {
        this(scale, scale, 25);
    }
    public MainGUI(int rows, int cols) {
        this(rows, cols, 25);
    }
    
    
    public int[] convert(int x, int y) {
        int row=(y-MARGIN_SIZE*squareSize)/squareSize;
        int col=(x-MARGIN_SIZE*squareSize)/squareSize;
        return new int[] {row, col};
    }
    
    // TODO Code here
    public void setSquare(int row, int col) {
        GameOfLifeFunctions.toggleCell(row, col, cells);
        repaint();
    }
    public void boundsCheck(int row, int col)
    {
        if(row < 0 || row >= getNumRows())
            throw new IndexOutOfBoundsException(
                    (new StringBuilder("row ")).append(row).append(" is out of bounds (min row value is 0, max row value is ").
                    append(getNumRows()-1).append(")").toString());
        if(col < 0 || col >= getNumCols())
            throw new IndexOutOfBoundsException(
                    (new StringBuilder("col ")).append(col).append(" is out of bounds (min col value is 0, max col value is ").
                    append(getNumCols()-1).append(")").toString());
    }
    
    private static BufferedImage getScreenShot(Component component) {
        BufferedImage image = new BufferedImage(
                component.getWidth(),
                component.getHeight(),
                BufferedImage.TYPE_INT_RGB
                );
        // call the Component's paint method, using
        // the Graphics object of the image.
        component.paint(image.getGraphics());
        return image;
    }
    protected void createMenus() {
        JMenuBar menuBar=new JMenuBar();

        JMenu menu=new JMenu("File");
        menuBar.add(menu);

        // copy of this reference for use in event handlers
        final JFrame frame=this;

        // save option
        JMenuItem save=new JMenuItem("Save Cells");
        menu.add(save);
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Save");
                
                //Create a file chooser
                final JFileChooser fc = new JFileChooser();
                //In response to a button click:
                int returnVal = fc.showSaveDialog(frame);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    try {
                        String[] lines=GameOfLifeFunctions.writeToString(cells);
                        PrintStream out=new PrintStream(fc.getSelectedFile());
                        for (String line : lines) {
                            out.println(line);
                        }
                        out.flush();
                        out.close();
                        /*
                        // write the image as a PNG
                        ImageIO.write(
                                img,
                                "png",
                                fc.getSelectedFile());
                         */
                    } catch(Exception ex) {
                        JOptionPane.showMessageDialog(frame,
                                "Unable to save file to "+fc.getSelectedFile().getName(),
                                "error",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
                
            }
        });
        
        JMenuItem load=new JMenuItem("Load Cells");
        menu.add(load);
        load.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Load");
                //Create a file chooser
                final JFileChooser fc = new JFileChooser();
                //In response to a button click:
                int returnVal = fc.showOpenDialog(frame);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    try {
                        String lines="";
                        Scanner scan=new Scanner(fc.getSelectedFile());
                        while (scan.hasNextLine()){
                            String line=scan.nextLine();
                            lines += line+"\n";
                        }
                        scan.close();
                        cells=GameOfLifeFunctions.readFromString(lines.split("\n"));
                        frame.repaint();
                    } catch(Exception ex) {
                        JOptionPane.showMessageDialog(frame,
                                "Unable to load file from "+fc.getSelectedFile().getName(),
                                "error",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
                
            }
        });

        // quit option
        JMenuItem quit=new JMenuItem("Quit");
        menu.add(quit);
        quit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                System.exit(0);
            }
        });
        
//        JRadioButtonMenuItem button1 = new JRadioButtonMenuItem("Slowest");
//        JRadioButtonMenuItem button2 = new JRadioButtonMenuItem("Slower");
//        JRadioButtonMenuItem button3 = new JRadioButtonMenuItem("Medium");
//        JRadioButtonMenuItem button4 = new JRadioButtonMenuItem("Faster");
//        JRadioButtonMenuItem button5 = new JRadioButtonMenuItem("Fastest");
        menuBar.add(new JLabel("Speed:"));
        ActionListener speedListener=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals(SLOWEST)) {
                    setDelay(750);
                } else if (e.getActionCommand().equals(SLOWER)){
                    setDelay(500);
                } else if (e.getActionCommand().equals(MEDIUM)){
                    setDelay(250);
                } else if (e.getActionCommand().equals(FASTER)){
                    setDelay(100);
                } else if (e.getActionCommand().equals(FASTEST)){
                    setDelay(50);
                }
            }
        };

        JRadioButton button1 = new JRadioButton(SLOWEST);
        JRadioButton button2 = new JRadioButton(SLOWER);
        JRadioButton button3 = new JRadioButton(MEDIUM, true);
        JRadioButton button4 = new JRadioButton(FASTER);
        JRadioButton button5 = new JRadioButton(FASTEST);
        button1.addActionListener(speedListener);
        button2.addActionListener(speedListener);
        button3.addActionListener(speedListener);
        button4.addActionListener(speedListener);
        button5.addActionListener(speedListener);
        
        ButtonGroup radio=new ButtonGroup();
        radio.add(button1);
        radio.add(button2);
        radio.add(button3);
        radio.add(button4);
        radio.add(button5);
        menuBar.add(button1);
        menuBar.add(button2);
        menuBar.add(button3);
        menuBar.add(button4);
        menuBar.add(button5);
        
        JButton go=new JButton("Go");
        go.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timer.start();
            }
        });
        JButton stop=new JButton("Stop");
        stop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timer.stop();
            }
        });
        JButton reset=new JButton("Reset");
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GameOfLifeFunctions.resetCells(cells);
                undoStack.clear();
                generation=0;
                generationLabel.setText("Generation: 0");
                panel.repaint();
            }
        });
        JButton step=new JButton("Step");
        step.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                undoStack.push(GameOfLifeFunctions.copyCells(cells));
                cells=GameOfLifeFunctions.calculateNextGeneration(cells);
                generation++;
                generationLabel.setText("Generation: "+ generation);
                panel.repaint();
            }
        });
        JButton undo=new JButton("Undo Step");
        undo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (undoStack.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Nothing to undo!");
                }else {
                    cells = undoStack.pop();
                    generation--;
                    generationLabel.setText("Generation: "+ generation);
                    panel.repaint();
                }
            }
        });

        
        menuBar.add(go);
        menuBar.add(stop);
        menuBar.add(step);
        menuBar.add(undo);
        menuBar.add(reset);

        generationLabel=new JLabel("Generation: 0");
        menuBar.add(generationLabel);
        this.setJMenuBar(menuBar);
    }
    public int getNumRows() {
        return numRows;
    }
    public int getNumCols() {
        return numCols;
    }
}
