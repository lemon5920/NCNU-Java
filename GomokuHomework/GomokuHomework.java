import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GomokuHomework extends JFrame implements ActionListener {
    private Gomoku GomokuBoard;
    private GomokuHomework() {
        super("五子棋");
        Menu m;
        MenuBar mb;
        GomokuBoard = new Gomoku(this);
        this.add(GomokuBoard);
        this.setMenuBar(mb = new MenuBar());
        mb.add(m = new Menu("遊戲")).add(new MenuItem("新遊戲")).addActionListener(this);
        //mb.add(new Menu("說明")).add(new MenuItem("關於本遊戲")).addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.pack();
        this.setVisible(true);
    }
    public static void main(String argv[]) {
        new GomokuHomework();
    }
    // implements the ActionListener interface
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("關於本遊戲")) {
            JOptionPane.showMessageDialog(this, "嘿嘿嘿 hehehe", "說明的喲", JOptionPane.INFORMATION_MESSAGE);
        } else if (command.equals("新遊戲")) {
            GomokuBoard.newGame();
        }
    }
}
class Gomoku extends Component implements MouseListener {
    public static final byte BORDER = 3;
    public static final byte EMPTY = 0;
    public static final byte BLACK = 1;
    public static final byte WHITE = 2;
    private byte[] board = new byte[441];
    private byte playing = BLACK;
    private Dimension mySize = new Dimension(646,646);
    private Frame parent;
    public Gomoku(Frame p) {
        this.addMouseListener(this);
        parent = p;
        newGame();
    }
    // The following 5 functions implement the MouseListener interface
    public void mouseClicked(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {
        int row = e.getY()/34;
        int col = e.getX()/34;
        if (row >= 19 || col >= 19) return; // 超過邊界
        if (board[(row+1)*21 + (col+1)] == EMPTY) { // 此位置可以下
            board[(row+1)*21 + (col+1)] = playing;
            repaint(); // notify Window Manager
            // Anyone Win?
            int location = (row+1)*21 + (col+1);
            
            if(whoWin(location, playing) == true) {
                if(playing == BLACK) {
                    JOptionPane.showMessageDialog(this, "黑子獲勝！", "Win！", JOptionPane.INFORMATION_MESSAGE);
                }else if(playing == WHITE) {
                    JOptionPane.showMessageDialog(this, "白子獲勝！", "Win！", JOptionPane.INFORMATION_MESSAGE);
                }
                this.newGame();
                return;
            }
            
            // System.out.println(playing);
            playing ^= 0x03;
        }
    }
    private boolean whoWin(int location, byte playing) {
        int[][] direction = {{-1, 1}, {-21, 21}, {-22, 22}, {-20, 20}};
        // System.out.println(location);
        for(int i = 0 ; i < direction.length ; i++) {
            int start = location;
            int total = 1;
            // System.out.println("Start: "+start);
            // System.out.println("Direction: "+direction[i][0]);

            while(board[(start+direction[i][0])] == playing) {
                start += direction[i][0];
            }
            while(board[(start+direction[i][1])] == playing) {
                start += direction[i][1];
                total++;
                if(total == 5) {
                    return true;
                }
            }
        }
        return false;
    }
    // override paint() defined in Component
    public void paint(Graphics g) {
        for(int i = 17 ; i < 646 ; i += 34) {
            g.drawLine(17, i, 629, i);
            g.drawLine(i, 17, i, 629);
        }
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                if (board[(i+1)*21 + (j+1)] == BLACK) {
                    g.setColor(Color.black);
                    g.fillOval(2+j*34, 2+i*34, 30, 30);
                } else if (board[(i+1)*21 + (j+1)] == WHITE) {
                    g.setColor(Color.white);
                    g.fillOval(3+j*34, 3+i*34, 28, 28);
                    g.setColor(Color.black);
                    g.drawOval(2+j*34, 2+i*34, 30, 30);
                }
            }
        }
        /*
        for(int i = 0 ; i < 441 ; i++) {
            System.out.printf("%2X ", board[i]);
            if((i+1) % 21 == 0) {
                System.out.println();
            }
        }
        */
    }
    public void newGame() {
        for (int i = 0; i < 441; i++) {
            board[i] = EMPTY;
        }
        for(int i = 0 ; i < 21 ; i++) {
            board[i] = BORDER;
        }
        for(int i = 440 ; i >= 440 - 20 ; i--) {
            board[i] = BORDER;
        }
        for(int i = 0 ; i < 441 ; i+=21) {
            board[i] = BORDER;
            board[i+20] = BORDER;
        }

        playing = BLACK;
        repaint();
    }
    // override getPreferredSize defined in Component,
    // so that the Component has proper size on screen
    public Dimension getPreferredSize() {
        return mySize;
    }
}
