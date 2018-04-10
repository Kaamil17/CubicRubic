package CubicSolver;

import java.util.Scanner;


public class CubicRubic {
// test have to learn
// constructor done
// benafj done
    // Original numbers for colors of cube rubrix.

    private static final int COLOR_GREEN = 1;
    private static final int COLOR_WHITE = 2;
    private static final int COLOR_BLUE = 3;
    private static final int COLOR_YELLOW = 4;
    private static final int COLOR_ORANGE = 5;
    private static final int COLOR_RED = 6;

    int[][] colors;

    public CubicRubic(int[][] inputData) {
        colors = new int[6][9];
        colors[0][0] = inputData[0][0];
        for (int firstNumberOfArray  = 0; firstNumberOfArray  < 6 ; firstNumberOfArray ++) {
            for (int secondNumberOfArray = 0; secondNumberOfArray < 9; secondNumberOfArray++) {
                System.out.println(colors[firstNumberOfArray ][secondNumberOfArray]);
            }
        }
    }

    public static void main(String[] args) {

        // Getting the Colors from the users.
        int cube_Colors[][] = new int[6][9];
        cube_Colors = getColors();

    }

    public static int[][] getColors() {
        int inputData[][] = new int[6][9];  // 6 sides and 9 pieces  each side.

        CubicRubic cube = new CubicRubic(inputData);

        int zeroCounter = 0;   // initializing the counters for loops


        Scanner in = new Scanner(System.in);

        // collecting the Data..

        // Collecting Data from the Green side.
        System.out.println("Enter the colors for the green side \n1 = GREEN\n2 = WHITE\n3 = BLUE\n4 = YELLOW\n5 = ORANGE\n6 = RED\n"
                + "The Orange side must be on the Top\n"
                + "The Red side must be on the bottom\n"
                + "The White side must be on the right\n"
                + "And the Yellow side must be in the left");
        for (zeroCounter = 0; zeroCounter <= 8; zeroCounter++) {
            inputData[0][zeroCounter] = Integer.parseInt(in.nextLine());
        }

        // Collecting Data from the White side.
        System.out.println("Please turn the Cubic ClockWise ->");
        System.out.println("Enter the colors for the White side \n1 = GREEN\n2 = WHITE\n3 = BLUE\n4 = YELLOW\n5 = ORANGE\n6 = RED\n"
                + "The Orange side must be on the Top\n"
                + "The Red side must be on the bottom\n"
                + "The Blue side must be on the right\n"
                + "And the Green side must be in the left");

        for (zeroCounter = 0; zeroCounter <= 8; zeroCounter++) {
            inputData[1][zeroCounter] = Integer.parseInt(in.nextLine());
        }

        // Collecting Data from the Blue side
        System.out.println("Please turn the Cubic ClockWise ->");
        System.out.println("Enter the colors for the Blue side \n1 = GREEN\n2 = WHITE\n3 = BLUE\n4 = YELLOW\n5 = ORANGE\n6 = RED\n"
                + "The Orange side must be on the Top\n"
                + "The Red side must be on the bottom\n"
                + "The Yellow side must be on the right\n"
                + "And the White side must be in the left");


        for (zeroCounter = 0; zeroCounter <= 8; zeroCounter++) {
            inputData[2][zeroCounter] = Integer.parseInt(in.nextLine());
        }

        // Collecting Data from the Yellow side
        System.out.println("Please turn the Cubic ClockWise ->");
        System.out.println("Enter the colors for the Yellow side \n1 = GREEN\n2 = WHITE\n3 = BLUE\n4 = YELLOW\n5 = ORANGE\n6 = RED\n"
                + "The Orange side must be on the Top\n"
                + "The Red side must be on the bottom\n"
                + "The Green side must be on the right\n"
                + "And the Blue side must be in the left");

        for (zeroCounter = 0; zeroCounter <= 8; zeroCounter++) {
            inputData[3][zeroCounter] = Integer.parseInt(in.nextLine());
        }

        // Enter colors for the Orange side.1
        System.out.println("please turn the Cubic forward for the orange side");
        for (zeroCounter = 0; zeroCounter <= 8; zeroCounter++) {
            inputData[4][zeroCounter] = Integer.parseInt(in.nextLine());

        }

        // Enter colors for the Red side.
        System.out.println("See the opposite side of Cubic for the red side");
        for (zeroCounter = 0; zeroCounter <= 8; zeroCounter++) {
            inputData[5][zeroCounter] = Integer.parseInt(in.nextLine());
        }

        return inputData;

    }

    //Moving Faces
    //GreenClockWise
    public int[][] greenClockWise() { // clockWise ->
        int[] primaryFace = new int[62];

        primaryFace[0] = colors[0][0];
        primaryFace[1] = colors[0][1];
        primaryFace[2] = colors[0][2];
        primaryFace[3] = colors[0][3];
        primaryFace[4] = colors[0][4];
        primaryFace[5] = colors[0][5];
        primaryFace[6] = colors[0][6];
        primaryFace[7] = colors[0][7];
        primaryFace[8] = colors[0][8];

        colors[0][2] = primaryFace[0];
        colors[0][5] = primaryFace[1];
        colors[0][8] = primaryFace[2];
        colors[0][1] = primaryFace[3];
        colors[0][4] = primaryFace[4];
        colors[0][7] = primaryFace[5];
        colors[0][0] = primaryFace[6];
        colors[0][3] = primaryFace[7];
        colors[0][6] = primaryFace[8];


        int[] primaryOuter = new int[62];
        primaryOuter[40] = colors[4][0];
        primaryOuter[43] = colors[4][3];
        primaryOuter[46] = colors[4][6];
        primaryOuter[10] = colors[1][0];
        primaryOuter[13] = colors[1][3];
        primaryOuter[16] = colors[1][6];
        primaryOuter[50] = colors[5][0];
        primaryOuter[53] = colors[5][3];
        primaryOuter[56] = colors[5][6];
        primaryOuter[32] = colors[3][2];
        primaryOuter[35] = colors[3][5];
        primaryOuter[38] = colors[3][8];

        colors[1][0] = primaryOuter[40];
        colors[1][3] = primaryOuter[43];
        colors[1][6] = primaryOuter[46];
        colors[5][0] = primaryOuter[10];
        colors[5][3] = primaryOuter[13];
        colors[5][6] = primaryOuter[16];
        colors[3][8] = primaryOuter[50];
        colors[3][5] = primaryOuter[53];
        colors[3][2] = primaryOuter[56];
        colors[4][0] = primaryOuter[38];
        colors[4][3] = primaryOuter[35];
        colors[4][6] = primaryOuter[32];

        // now we have to update values after turning the Green side ClockWise.
        return colors;
    }

    public int[][] greenCounterClockWise() { // greenCounterClockWise <-
        int[] primaryFace = new int[62];
        primaryFace[0] = colors[0][0];
        primaryFace[1] = colors[0][1];
        primaryFace[2] = colors[0][2];
        primaryFace[3] = colors[0][3];
        primaryFace[4] = colors[0][4];
        primaryFace[5] = colors[0][5];
        primaryFace[6] = colors[0][6];
        primaryFace[7] = colors[0][7];
        primaryFace[8] = colors[0][8];

        colors[0][6] = primaryFace[0];
        colors[0][3] = primaryFace[1];
        colors[0][0] = primaryFace[2];
        colors[0][7] = primaryFace[3];
        colors[0][4] = primaryFace[4];
        colors[0][1] = primaryFace[5];
        colors[0][8] = primaryFace[6];
        colors[0][5] = primaryFace[7];
        colors[0][2] = primaryFace[8];


        int[] primaryOuter = new int[62];
        primaryOuter[40] = colors[4][0];
        primaryOuter[43] = colors[4][3];
        primaryOuter[46] = colors[4][6];
        primaryOuter[10] = colors[1][0];
        primaryOuter[13] = colors[1][3];
        primaryOuter[16] = colors[1][6];
        primaryOuter[50] = colors[5][0];
        primaryOuter[53] = colors[5][3];
        primaryOuter[56] = colors[5][6];
        primaryOuter[38] = colors[3][8];
        primaryOuter[35] = colors[3][5];
        primaryOuter[32] = colors[3][2];

        colors[3][8] = primaryOuter[40];
        colors[3][5] = primaryOuter[43];
        colors[3][2] = primaryOuter[46];
        colors[4][0] = primaryOuter[10];
        colors[4][3] = primaryOuter[13];
        colors[4][6] = primaryOuter[16];
        colors[1][0] = primaryOuter[50];
        colors[1][3] = primaryOuter[53];
        colors[1][6] = primaryOuter[56];
        colors[5][0] = primaryOuter[38];
        colors[5][3] = primaryOuter[35];
        colors[5][6] = primaryOuter[32];

        // Now we have to update the value after turning the GreenClockWise
        System.out.println("GreenClockWise");
        return colors;

    }


    public int[][] whiteClockWise() {     // Turning white side clockWise
        int[] primaryFace = new int[62];
        primaryFace[0] = colors[1][0];
        primaryFace[1] = colors[1][1];
        primaryFace[2] = colors[1][2];
        primaryFace[3] = colors[1][3];
        primaryFace[4] = colors[1][4];
        primaryFace[5] = colors[1][5];
        primaryFace[6] = colors[1][6];
        primaryFace[7] = colors[1][7];
        primaryFace[8] = colors[1][8];

        colors[1][0] = primaryFace[2];
        colors[1][1] = primaryFace[5];
        colors[1][2] = primaryFace[8];
        colors[1][3] = primaryFace[1];
        colors[1][4] = primaryFace[4];
        colors[1][5] = primaryFace[7];
        colors[1][6] = primaryFace[0];
        colors[1][7] = primaryFace[3];
        colors[1][8] = primaryFace[6];

        int[] primaryOuter = new int[62];
        primaryOuter[46] = colors[4][6];
        primaryOuter[47] = colors[4][7];
        primaryOuter[48] = colors[4][8];
        primaryOuter[8] = colors[0][8];
        primaryOuter[5] = colors[0][5];
        primaryOuter[2] = colors[0][2];
        primaryOuter[20] = colors[2][0];
        primaryOuter[21] = colors[2][1];
        primaryOuter[22] = colors[2][2];
        primaryOuter[52] = colors[5][2];
        primaryOuter[51] = colors[5][1];
        primaryOuter[50] = colors[5][0];

        colors[2][0] = primaryOuter[46];
        colors[2][1] = primaryOuter[47];
        colors[2][2] = primaryOuter[48];
        colors[5][2] = primaryOuter[8];
        colors[5][1] = primaryOuter[5];
        colors[5][0] = primaryOuter[2];
        colors[0][8] = primaryOuter[52];
        colors[0][5] = primaryOuter[51];
        colors[0][2] = primaryOuter[50];
        colors[4][6] = primaryOuter[20];
        colors[4][7] = primaryOuter[23];
        colors[4][8] = primaryOuter[26];
        System.out.println("WhiteClockWise");
        return colors;
    }

    public int[][] whiteCounterClockWise() {

        int[] primaryFace = new int[62];
        primaryFace[0] = colors[1][0];
        primaryFace[1] = colors[1][1];
        primaryFace[2] = colors[1][2];
        primaryFace[3] = colors[1][3];
        primaryFace[4] = colors[1][4];
        primaryFace[5] = colors[1][5];
        primaryFace[6] = colors[1][6];
        primaryFace[7] = colors[1][7];
        primaryFace[8] = colors[1][8];


        colors[1][6] = primaryFace[0];
        colors[1][3] = primaryFace[1];
        colors[1][0] = primaryFace[2];
        colors[1][7] = primaryFace[3];
        colors[1][4] = primaryFace[4];
        colors[1][1] = primaryFace[5];
        colors[1][8] = primaryFace[6];
        colors[1][5] = primaryFace[7];
        colors[1][2] = primaryFace[8];

        int[] primaryOuter = new int[62];
        primaryOuter[46] = colors[4][6];
        primaryOuter[47] = colors[4][7];
        primaryOuter[48] = colors[4][8];
        primaryOuter[20] = colors[2][0];
        primaryOuter[23] = colors[2][3];
        primaryOuter[26] = colors[2][6];
        primaryOuter[52] = colors[5][2];
        primaryOuter[51] = colors[5][1];
        primaryOuter[50] = colors[5][0];
        primaryOuter[8] = colors[0][8];
        primaryOuter[5] = colors[0][5];
        primaryOuter[2] = colors[0][2];

        colors[0][8] = primaryOuter[46];
        colors[0][5] = primaryOuter[47];
        colors[0][2] = primaryOuter[48];
        colors[4][6] = primaryOuter[20];
        colors[4][7] = primaryOuter[23];
        colors[4][8] = primaryOuter[26];
        colors[2][0] = primaryOuter[52];
        colors[2][3] = primaryOuter[51];
        colors[2][6] = primaryOuter[50];
        colors[5][2] = primaryOuter[8];
        colors[5][1] = primaryOuter[5];
        colors[5][0] = primaryOuter[2];
        System.out.println("whiteCounterClockWise");
        return colors;
    }

    public int[][] blueClockWise() {

        int[] primaryFace = new int[62];
        primaryFace[0] = colors[2][0];
        primaryFace[1] = colors[2][1];
        primaryFace[2] = colors[2][2];
        primaryFace[3] = colors[2][3];
        primaryFace[4] = colors[2][4];
        primaryFace[5] = colors[2][5];
        primaryFace[6] = colors[2][6];
        primaryFace[7] = colors[2][7];
        primaryFace[8] = colors[2][8];

        colors[2][2] = primaryFace[0];
        colors[2][3] = primaryFace[1];
        colors[2][8] = primaryFace[2];
        colors[2][1] = primaryFace[3];
        colors[2][4] = primaryFace[4];
        colors[2][7] = primaryFace[5];
        colors[2][0] = primaryFace[6];
        colors[2][3] = primaryFace[7];
        colors[2][6] = primaryFace[8];

        int[] primaryOuter = new int[62];
        primaryOuter[42] = colors[4][2];
        primaryOuter[45] = colors[4][5];
        primaryOuter[48] = colors[4][8];
        primaryOuter[12] = colors[1][2];
        primaryOuter[15] = colors[1][5];
        primaryOuter[18] = colors[1][8];
        primaryOuter[52] = colors[5][2];
        primaryOuter[55] = colors[5][5];
        primaryOuter[58] = colors[5][8];
        primaryOuter[30] = colors[3][0];
        primaryOuter[33] = colors[3][3];
        primaryOuter[36] = colors[3][6];

        colors[3][0] = primaryOuter[48];
        colors[3][3] = primaryOuter[45];
        colors[3][6] = primaryOuter[42];
        colors[5][8] = primaryOuter[30];
        colors[5][5] = primaryOuter[33];
        colors[5][2] = primaryOuter[36];
        colors[1][8] = primaryOuter[58];
        colors[1][5] = primaryOuter[55];
        colors[1][2] = primaryOuter[52];
        colors[4][2] = primaryOuter[12];
        colors[4][5] = primaryOuter[15];
        colors[4][8] = primaryOuter[18];
        return colors;
    }

    public int[][] BlueCounterClockWise() {

        int[] primaryFace = new int[62];
        primaryFace[0] = colors[2][0];
        primaryFace[1] = colors[2][1];
        primaryFace[2] = colors[2][2];
        primaryFace[3] = colors[2][3];
        primaryFace[4] = colors[2][4];
        primaryFace[5] = colors[2][5];
        primaryFace[6] = colors[2][6];
        primaryFace[7] = colors[2][7];
        primaryFace[8] = colors[2][8];

        colors[2][6] = primaryFace[0];
        colors[2][3] = primaryFace[1];
        colors[2][0] = primaryFace[2];
        colors[2][7] = primaryFace[3];
        colors[2][4] = primaryFace[4];
        colors[2][1] = primaryFace[5];
        colors[2][8] = primaryFace[6];
        colors[2][5] = primaryFace[7];
        colors[2][2] = primaryFace[8];

        int[] primaryOuter = new int[62];
        primaryOuter[48] = colors[4][8];
        primaryOuter[45] = colors[4][5];
        primaryOuter[42] = colors[4][2];
        primaryOuter[30] = colors[3][0];
        primaryOuter[33] = colors[3][3];
        primaryOuter[36] = colors[3][6];
        primaryOuter[58] = colors[5][8];
        primaryOuter[55] = colors[5][5];
        primaryOuter[52] = colors[5][2];
        primaryOuter[18] = colors[1][8];
        primaryOuter[15] = colors[1][5];
        primaryOuter[12] = colors[1][2];

        colors[3][0] = primaryOuter[48];
        colors[3][3] = primaryOuter[45];
        colors[3][6] = primaryOuter[42];
        colors[5][8] = primaryOuter[30];
        colors[5][5] = primaryOuter[33];
        colors[5][2] = primaryOuter[36];
        colors[1][8] = primaryOuter[58];
        colors[1][5] = primaryOuter[55];
        colors[1][2] = primaryOuter[52];
        colors[4][2] = primaryOuter[12];
        colors[4][5] = primaryOuter[15];
        colors[4][8] = primaryOuter[18];
        System.out.println("Blue counter Clock Wise");
        return colors;
    }

    public int[][] yellowClockWise() {

        int[] primaryFace = new int[62];
        primaryFace[0] = colors[3][0];
        primaryFace[1] = colors[3][1];
        primaryFace[2] = colors[3][2];
        primaryFace[3] = colors[3][3];
        primaryFace[4] = colors[3][4];
        primaryFace[5] = colors[3][5];
        primaryFace[6] = colors[3][6];
        primaryFace[7] = colors[3][7];
        primaryFace[8] = colors[3][8];

        colors[3][2] = primaryFace[0];
        colors[3][1] = primaryFace[3];
        colors[3][0] = primaryFace[6];
        colors[3][3] = primaryFace[7];
        colors[3][6] = primaryFace[8];
        colors[3][7] = primaryFace[5];
        colors[3][8] = primaryFace[2];
        colors[2][5] = primaryFace[7];
        colors[2][2] = primaryFace[8];

        int[] primaryOuter = new int[62];
        primaryOuter[40] = colors[4][0];
        primaryOuter[41] = colors[4][1];
        primaryOuter[42] = colors[4][2];
        primaryOuter[0] = colors[0][3];
        primaryOuter[3] = colors[0][3];
        primaryOuter[6] = colors[0][6];
        primaryOuter[56] = colors[5][8];
        primaryOuter[57] = colors[5][7];
        primaryOuter[58] = colors[5][8];
        primaryOuter[28] = colors[2][8];
        primaryOuter[25] = colors[2][5];
        primaryOuter[22] = colors[2][2];

        colors[0][0] = primaryOuter[42];
        colors[0][3] = primaryOuter[41];
        colors[0][6] = primaryOuter[42];
        colors[5][6] = primaryOuter[0];
        colors[5][7] = primaryOuter[3];
        colors[5][2] = primaryOuter[36];
        colors[5][8] = primaryOuter[6];
        colors[2][5] = primaryOuter[57];
        colors[2][2] = primaryOuter[58];
        colors[4][2] = primaryOuter[28];
        colors[4][1] = primaryOuter[25];
        colors[4][0] = primaryOuter[22];

        System.out.println("Yellow  Clock Wise");
        return colors;
    }

    public int[][] yellowCounterClockWise() {

        int[] primaryFace = new int[62];
        primaryFace[0] = colors[3][0];
        primaryFace[1] = colors[3][1];
        primaryFace[2] = colors[3][2];
        primaryFace[3] = colors[3][3];
        primaryFace[4] = colors[3][4];
        primaryFace[5] = colors[3][5];
        primaryFace[6] = colors[3][6];
        primaryFace[7] = colors[3][7];
        primaryFace[8] = colors[3][8];

        colors[3][6] = primaryFace[0];
        colors[3][3] = primaryFace[1];
        colors[3][0] = primaryFace[2];
        colors[3][7] = primaryFace[3];
        colors[3][4] = primaryFace[4];
        colors[3][1] = primaryFace[5];
        colors[3][8] = primaryFace[6];
        colors[3][5] = primaryFace[7];
        colors[3][2] = primaryFace[8];

        int[] primaryOuter = new int[62];
        primaryOuter[42] = colors[4][2];
        primaryOuter[41] = colors[4][1];
        primaryOuter[40] = colors[4][0];
        primaryOuter[0] = colors[0][0];
        primaryOuter[3] = colors[0][3];
        primaryOuter[6] = colors[0][6];
        primaryOuter[56] = colors[5][6];
        primaryOuter[57] = colors[5][7];
        primaryOuter[58] = colors[5][8];
        primaryOuter[28] = colors[2][8];
        primaryOuter[25] = colors[2][5];
        primaryOuter[22] = colors[2][2];

        colors[2][8] = primaryOuter[42];
        colors[2][5] = primaryOuter[41];
        colors[2][2] = primaryOuter[42];
        colors[4][2] = primaryOuter[0];
        colors[4][1] = primaryOuter[3];
        colors[4][0] = primaryOuter[6];
        colors[0][0] = primaryOuter[56];
        colors[0][3] = primaryOuter[57];
        colors[0][6] = primaryOuter[58];
        colors[5][6] = primaryOuter[28];
        colors[5][7] = primaryOuter[25];
        colors[5][8] = primaryOuter[22];
        System.out.println("Yellow Counter Clock Wise");
        return colors;
    }

    public int[][] orangeClockWise() {
        int[] primaryFace = new int[62];
        primaryFace[0] = colors[4][0];
        primaryFace[1] = colors[4][1];
        primaryFace[2] = colors[4][2];
        primaryFace[3] = colors[4][3];
        primaryFace[4] = colors[4][4];
        primaryFace[5] = colors[4][5];
        primaryFace[6] = colors[4][6];
        primaryFace[7] = colors[4][7];
        primaryFace[8] = colors[4][8];

        colors[4][2] = primaryFace[0];
        colors[4][5] = primaryFace[1];
        colors[4][8] = primaryFace[2];
        colors[4][1] = primaryFace[3];
        colors[4][4] = primaryFace[4];
        colors[4][7] = primaryFace[5];
        colors[4][0] = primaryFace[6];
        colors[4][3] = primaryFace[7];
        colors[4][6] = primaryFace[8];

        int[] primaryOuter = new int[62];
        primaryOuter[32] = colors[3][2];
        primaryOuter[31] = colors[3][1];
        primaryOuter[30] = colors[3][0];
        primaryOuter[22] = colors[2][2];
        primaryOuter[21] = colors[2][1];
        primaryOuter[20] = colors[2][0];
        primaryOuter[12] = colors[1][2];
        primaryOuter[11] = colors[1][1];
        primaryOuter[10] = colors[1][0];
        primaryOuter[2] = colors[0][2];
        primaryOuter[1] = colors[0][1];
        primaryOuter[0] = colors[0][0];

        colors[2][2] = primaryOuter[32];
        colors[2][1] = primaryOuter[31];
        colors[2][0] = primaryOuter[30];
        colors[1][2] = primaryOuter[22];
        colors[1][1] = primaryOuter[21];
        colors[1][0] = primaryOuter[20];
        colors[0][2] = primaryOuter[12];
        colors[0][1] = primaryOuter[11];
        colors[0][0] = primaryOuter[10];
        colors[3][2] = primaryOuter[2];
        colors[3][1] = primaryOuter[1];
        colors[3][0] = primaryOuter[0];
        System.out.println("Orange Clock Wise");
        return colors;

    }

    public int[][] orangeCounterClockWise() {
        int[] primaryFace = new int[62];
        primaryFace[0] = colors[4][0];
        primaryFace[1] = colors[4][1];
        primaryFace[2] = colors[4][2];
        primaryFace[3] = colors[4][3];
        primaryFace[4] = colors[4][4];
        primaryFace[5] = colors[4][5];
        primaryFace[6] = colors[4][6];
        primaryFace[7] = colors[4][7];
        primaryFace[8] = colors[4][8];

        colors[4][6] = primaryFace[0];
        colors[4][3] = primaryFace[1];
        colors[4][0] = primaryFace[2];
        colors[4][7] = primaryFace[3];
        colors[4][4] = primaryFace[4];
        colors[4][1] = primaryFace[5];
        colors[4][8] = primaryFace[6];
        colors[4][5] = primaryFace[7];
        colors[4][2] = primaryFace[8];

        int[] primaryOuter = new int[62];
        primaryOuter[32] = colors[3][2];
        primaryOuter[31] = colors[3][1];
        primaryOuter[30] = colors[3][0];
        primaryOuter[22] = colors[2][2];
        primaryOuter[21] = colors[2][1];
        primaryOuter[20] = colors[2][0];
        primaryOuter[12] = colors[1][2];
        primaryOuter[11] = colors[1][1];
        primaryOuter[10] = colors[1][0];
        primaryOuter[2] = colors[0][2];
        primaryOuter[1] = colors[0][1];
        primaryOuter[0] = colors[0][0];

        colors[0][2] = primaryOuter[32];
        colors[0][1] = primaryOuter[31];
        colors[0][0] = primaryOuter[30];
        colors[3][2] = primaryOuter[22];
        colors[3][1] = primaryOuter[21];
        colors[3][0] = primaryOuter[20];
        colors[2][2] = primaryOuter[12];
        colors[2][1] = primaryOuter[11];
        colors[2][0] = primaryOuter[10];
        colors[1][2] = primaryOuter[2];
        colors[1][1] = primaryOuter[1];
        colors[1][0] = primaryOuter[0];
        System.out.println("Orange Counter Clock Wise ");
        return colors;

    }

    public int[][] redClockWise() {
        int[] primaryFace = new int[62];
        primaryFace[0] = colors[5][0];
        primaryFace[1] = colors[5][1];
        primaryFace[2] = colors[5][2];
        primaryFace[3] = colors[5][3];
        primaryFace[4] = colors[5][4];
        primaryFace[5] = colors[5][5];
        primaryFace[6] = colors[5][6];
        primaryFace[7] = colors[5][7];
        primaryFace[8] = colors[5][8];

        colors[5][2] = primaryFace[0];
        colors[5][5] = primaryFace[1];
        colors[5][8] = primaryFace[2];
        colors[5][1] = primaryFace[3];
        colors[5][4] = primaryFace[4];
        colors[5][7] = primaryFace[5];
        colors[5][0] = primaryFace[6];
        colors[5][3] = primaryFace[7];
        colors[5][6] = primaryFace[8];


        int[] primaryOuter = new int[62];
        primaryOuter[38] = colors[3][8];
        primaryOuter[37] = colors[3][7];
        primaryOuter[36] = colors[3][6];
        primaryOuter[28] = colors[2][8];
        primaryOuter[27] = colors[2][7];
        primaryOuter[26] = colors[2][6];
        primaryOuter[18] = colors[1][8];
        primaryOuter[17] = colors[1][7];
        primaryOuter[16] = colors[1][6];
        primaryOuter[8] = colors[0][8];
        primaryOuter[7] = colors[0][7];
        primaryOuter[6] = colors[0][6];

        colors[2][6] = primaryOuter[16];
        colors[2][7] = primaryOuter[17];
        colors[2][8] = primaryOuter[18];
        colors[3][6] = primaryOuter[26];
        colors[3][7] = primaryOuter[27];
        colors[3][8] = primaryOuter[28];
        colors[0][6] = primaryOuter[36];
        colors[0][7] = primaryOuter[37];
        colors[0][8] = primaryOuter[38];
        colors[1][6] = primaryOuter[6];
        colors[1][7] = primaryOuter[7];
        colors[1][8] = primaryOuter[8];
        return colors;
    }

    public int[][] redCounterClockWise() {
        int[] primaryFace = new int[62];

        primaryFace[0] = colors[5][0];
        primaryFace[1] = colors[5][1];
        primaryFace[2] = colors[5][2];
        primaryFace[3] = colors[5][3];
        primaryFace[4] = colors[5][4];
        primaryFace[5] = colors[5][5];
        primaryFace[6] = colors[5][6];
        primaryFace[7] = colors[5][7];
        primaryFace[8] = colors[5][8];

        colors[5][6] = primaryFace[0];
        colors[5][3] = primaryFace[1];
        colors[5][0] = primaryFace[2];
        colors[5][7] = primaryFace[3];
        colors[5][4] = primaryFace[4];
        colors[5][1] = primaryFace[5];
        colors[5][8] = primaryFace[6];
        colors[5][5] = primaryFace[7];
        colors[5][2] = primaryFace[8];

        int[] primaryOuter = new int[62];

        primaryOuter[16] = colors[1][6];
        primaryOuter[17] = colors[1][7];
        primaryOuter[18] = colors[1][8];
        primaryOuter[26] = colors[2][6];
        primaryOuter[27] = colors[2][7];
        primaryOuter[28] = colors[2][8];
        primaryOuter[36] = colors[3][6];
        primaryOuter[37] = colors[3][7];
        primaryOuter[38] = colors[3][8];
        primaryOuter[6] = colors[0][6];
        primaryOuter[7] = colors[0][7];
        primaryOuter[8] = colors[0][8];


        colors[0][6] = primaryOuter[16];
        colors[0][7] = primaryOuter[17];
        colors[0][8] = primaryOuter[18];
        colors[1][6] = primaryOuter[26];
        colors[1][7] = primaryOuter[27];
        colors[1][8] = primaryOuter[28];
        colors[2][6] = primaryOuter[36];
        colors[2][7] = primaryOuter[37];
        colors[2][8] = primaryOuter[38];
        colors[3][6] = primaryOuter[6];
        colors[3][7] = primaryOuter[7];
        colors[3][8] = primaryOuter[8];
        System.out.println("redCounterClockWise");
        return colors;

    }

}

