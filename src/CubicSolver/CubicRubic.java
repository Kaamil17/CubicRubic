package CubicSolver;


import java.util.Scanner;

public class CubicRubic {

    private static final int COLOR_GREEN = 1;
    private static final int COLOR_WHITE = 2;
    private static final int COLOR_BLUE = 3;
    private static final int COLOR_YELLOW = 4;
    private static final int COLOR_ORANGE = 5;
    private static final int COLOR_RED = 6;


    public static void main(String[] args) {

        // Getting the Colors from the users.
        int cube_Colors[][] = new int[6][9];
        cube_Colors = getColors();

    }

    public static int[][] getColors() {
        int inputData[][] = new int[6][9];  // 6 sides and 9 pieces  each side.

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
            zeroCounter++;
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

        // Enter colors for the Orange side.
        System.out.println("please turn the Cubic forward");
        for (zeroCounter = 0; zeroCounter <= 8; ++zeroCounter) {
            inputData[4][zeroCounter] = Integer.parseInt(in.nextLine());

        }

        // Enter colors for the Red side.
        System.out.println("See the opposite side of Cubic");
        for (zeroCounter = 0; zeroCounter <= 8; ++zeroCounter) {
            inputData[5][zeroCounter] = Integer.parseInt(in.nextLine());
        }

        return inputData;

    }

    //Moving Faces
    //GreenClockWise
    public static int[][] greenClockWise(int[][] colors) {
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
        System.out.println("GreenClockWise");
        return colors;
    }

    public static int[][] greenCounterClockWise(int[][] colors) { // greenClockWise <-
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


    public static int[][] whiteClockWise(int[][] colors) {     // Turning white side clockWise
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
        colors[4][6] = primaryOuter[8];
        colors[4][6] = primaryOuter[8];
        colors[4][6] = primaryOuter[8];
        System.out.println("WhiteClockWise");
        return colors;


    }


}

