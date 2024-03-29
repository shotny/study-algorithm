package codeup100;

import java.io.*;
import java.util.Scanner;

/*
public class Main{
    public static void main(String[] args) {
    }
}
*/

public class CodeupBasic {

    public static void test() {

//        basic1001();
//        basic1002();
//        basic1003();
//        basic1004();
//        basic1005();
//        basic1006();
//        basic1007();
//        basic1008();
//        basic1010();

//        basic1011();
//        basic1012();
//        basic1013();
//        basic1014();
//        basic1015();
//        basic1017();
//        basic1018();
//        basic1019();
//        basic1020();

//        basic1021();
//        basic1022();
//        basic1023();
//        basic1024();
//        basic1025();
//        basic1026();
//        basic1027();
//        basic1028();
//        basic1029();
//        basic1030();

//        basic1031();
//        basic1032();
//        basic1033();
//        basic1034();
//        basic1035();
//        basic1036();
//        basic1036();
//        basic1037();
//        basic1038();
//        basic1039();
//        basic1040();

//        basic1041();
//        basic1042();
//        basic1043();
//        basic1044();
//        basic1045();
//        basic1046();
//        basic1047();
//        basic1048();
//        basic1049();
//        basic1050();

//        basic1051();
//        basic1052();
//        basic1053();
//        basic1054();
//        basic1055();

//        basic1056();
//        basic1057();
//        basic1058();
//        basic1059();
//        basic1060();

//        basic1061();
//        basic1062();
//        basic1063();
//        basic1064();
//        basic1065();
//        basic1066();
//        basic1067();
//        basic1068();
//        basic1069();
//        basic1070();
//        basic1071();
//        basic1072();
//        basic1073();
//        basic1074();
//        basic1075();
//        basic1076();
//        basic1077();
//        basic1078();
//        basic1079();
//        basic1080();
//        basic1081();
//        basic1082();
//        basic1083();
//        basic1084();
//        basic1085();
//        basic1086();
//        basic1087();
//        basic1088();
//        basic1089();
//        basic1090();
//        basic1091();
//        basic1092();
//        basic1093();
//        basic1094();
//        basic1095();
//        basic1096();
//        basic1097();
//        basic1098();
//        basic1099();
    }

//    11. 25. 1087~1099 기초100제 끝!
    public static void basic1087() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; sum < n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
    public static void basic1088() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            if(i%3 != 0){
                System.out.printf("%d ", i);
            }
        }
    }
    public static void basic1089() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int d = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(a + d*(n-1));
    }
    public static void basic1090() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int r = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.printf("%.0f", a*Math.pow(r, (n-1)));
    }
    public static void basic1091() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int m = scanner.nextInt();
        int d = scanner.nextInt();
        int n = scanner.nextInt();
        long result = a;

        for (int i = 1; i < n; i++) {
            result = (result * m) + d;
        }
        System.out.println(result);
    }
    public static void basic1092() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int day =1;

        while (day % a != 0 || day % b != 0 || day % c != 0) {
            day++;
        }
        System.out.println(day);
    }
    public static void basic1093() {
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        int[] numList = new int[23];
        for (int i = 1; i <= times; i++) {
            int tmp = scanner.nextInt();
            numList[tmp-1]++;
        }
        for (int j = 0; j < numList.length; j++) {
            System.out.printf("%d ", numList[j]);
        }
    }
    public static void basic1094() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 1; i <= n; i++) {
            a[n - i] = scanner.nextInt();
        }
        for (int j = 0; j < a.length; j++) {
            System.out.printf("%d ", a[j]);
        }
    }
    public static void basic1095() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int tmp = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            int now = scanner.nextInt();
            if (now <= tmp) {
                tmp = now;
            }
        }
        System.out.println(tmp);
    }
    public static void basic1096() {
        Scanner scanner = new Scanner(System.in);
        int wTotal = scanner.nextInt();
        int[][] board = new int[19][19];

        for (int i = 1; i <= wTotal; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            board[x-1][y-1]=1;
        }

        for (int j = 0; j < board.length; j++) {
            for (int k = 0; k < board[j].length; k++) {
                System.out.printf("%d ", board[j][k]);
            }
            System.out.println();
        }
    }
    public static void basic1097() {
        Scanner scanner = new Scanner(System.in);
        int[][] board = new int[19][19];

        // 바둑판 상황 입력받기
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = scanner.nextInt();
            }
        }

        // 십자뒤집기 좌표 개수
        int n = scanner.nextInt();

        // 입력된 좌표 개수만큼 순서대로 십자뒤집기
        for (int k = 1; k <= n; k++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            // 가로 뒤집기 _ 입력된 좌표가 아닌 경우만 뒤집음
            for (int i = 0; i < 19; i++) {
                if (i != y-1) {
                    if (board[x - 1][i] == 1) {
                        board[x-1][i] = 0;
                    } else {
                        board[x-1][i] = 1;
                    }
                }

                // 세로 뒤집기 _ 입력된 좌표가 아닌 경우만 뒤집음
                if (i != x - 1) {
                    if (board[i][y - 1] == 1) {
                        board[i][y-1] = 0;
                    } else {
                        board[i][y-1] = 1;
                    }
                }

//                for (int j = 0; j < board.length; j++) {
//                    if (j != x - 1) {
//                        if (board[j][y - 1] == 1) {
//                            board[j][y-1] = 0;
//                        } else {
//                            board[j][y-1] = 1;
//                        }
//                    }
//                }
            }
            // 십자뒤집기 끝
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.printf("%d ", board[i][j]);
            }
            System.out.println();
        }
    }
    public static void basic1098() {
        Scanner scanner = new Scanner(System.in);
        int boarH = scanner.nextInt();
        int boarW = scanner.nextInt();
        int[][] board = new int[boarH][boarW];

        int sticks = scanner.nextInt();

        for (int n = 1; n <= sticks; n++) {
            int stickL = scanner.nextInt();
            int direction = scanner.nextInt(); // 가로는 0 세로는 1
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            // 막대 길이만큼
            for (int i=1; i<= stickL; i++){
                // 가로 세로 방향에 따라 뒤집고 이동
                if (direction == 0) {
                    board[x-1][y-1] = 1;
                    y += 1;
                } else {
                    board[x-1][y-1] = 1;
                    x += 1;
                }
            }
            // 막대 하나 가리기 끝
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.printf("%d ", board[i][j]);
            }
            System.out.println();
        }
    }
    public static void basic1099() {
        Scanner scanner = new Scanner(System.in);
        int[][] maze = new int[10][10];

        // 미로 지도 입력
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                maze[i][j] = scanner.nextInt();
            }
        }

        // 현재위치 표시
        int nowX = 1;
        int nowY = 1;

        // 길 탐색 시작 _ 오른쪽으로 먼저 감
        while (maze[nowX][nowY] != 2) {
            maze[nowX][nowY] = 9;
            // 장애물 없으면 Go
            if(maze[nowX][nowY+1] != 1){
                nowY += 1;
            } else if (maze[nowX+1][nowY] != 1) {
                nowX += 1;
            } else break;
        }

        // 먹이가 있어서(2에서) 멈췄다면 좌표찍기
        if (maze[nowX][nowY] == 2) {
            maze[nowX][nowY] = 9;
        }

        // 개미가 이동한 경로는~~
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                System.out.printf("%d ", maze[i][j]);
            }
            System.out.println();
        }
    }

    //    11. 22. 1085 ~ 1086

    //소리 파일의 저장 용량_1024KB(2의 10승) = 1MB
    // 1mb = 1024kb = 1024*1024 byte = 1024*1024*8 bit
    public static void basic1085() {
        Scanner scanner = new Scanner(System.in);
        int hz = scanner.nextInt();
        int bit = scanner.nextInt();
        int track = scanner.nextInt();
        int second = scanner.nextInt();

        long bitSize = (long)hz*bit*track*second;
        float mbSize = bitSize/(float)(1024*1024*8);
        System.out.println(bitSize);
        System.out.printf("%.1f MB", mbSize);
    }

    // r,g,b 각 8비트씩 / 한 점은 총 24비트로 표현
    public static void basic1086() {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int b = scanner.nextInt();
        float mbSize = (long)w*h*b/(float)(1024*1024*8);
        System.out.printf("%.2f MB", mbSize);
    }


    //    11. 18. 1081 ~ 1084
    public static void basic1081() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.printf("%d %d%n",i,j);
            }
        }
    }
    public static void basic1082() {
        Scanner scanner = new Scanner(System.in);
        int hex = scanner.nextInt(16);  // n진수도 int로 받을 수 있다..
        for (int i=1; i<16; i++){
            System.out.printf("%X*%X=%X%n", hex, i, hex*i);
        }
    }
    public static void basic1083() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for(int i=1; i<=number; i++){
            if (i % 3 == 0) {
                System.out.print("X");
            } else { System.out.print(i); }
            if(i != number){
                System.out.print(" ");
            }
        }
    }
    public static void basic1084() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
            String light = reader.readLine();

            int red = Integer.parseInt(light.split(" ")[0]);
            int blue = Integer.parseInt(light.split(" ")[1]);
            int green = Integer.parseInt(light.split(" ")[2]);
            int count = 0;

            for (int i = 0; i < red; i++) {
                for (int j = 0; j < green; j++) {
                    for (int k = 0; k < blue; k++) {
                        writer.write(i + " " + j + " " + k + "\n");
                        count++;
                    }
                }
            }
            writer.write(String.valueOf(count));
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /* 시간초과
        Scanner scanner = new Scanner(System.in);
        int red = scanner.nextInt();
        int green = scanner.nextInt();
        int blue = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < red; i++) {
            for (int j = 0; j < green; j++) {
                for (int k = 0; k < blue; k++) {
                    System.out.printf("%d %d %d%n", i, j, k);
                    count++;
                }
            }
        }
        System.out.println(count);
         */
    }


//    11.17. 1061 ~ 1080
    public static void basic1061() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a|b);
    }
    public static void basic1062() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a^b);
    }

    //3항 연산자 사용하기
    public static void basic1063() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.printf("%d", a > b ? a : b);
    }
    public static void basic1064() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.printf("%d", (a<b ? a:b)<c? (a<b ? a:b):c);
    }
    public static void basic1065() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if(a%2 == 0){
            System.out.println(a);
        }
        if(b%2 == 0){
            System.out.println(b);
        }
        if(c%2 == 0){
            System.out.println(c);
        }
    }
    public static void basic1066() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if(a%2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        if(b%2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        if(c%2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
    public static void basic1067() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a > 0) {
            System.out.println("plus");
            if (a % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        } else {
            System.out.println("minus");
            if (a % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
    public static void basic1068() {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        if(score >= 90 & score <= 100){
            System.out.println("A");
        } else if (score >= 70) {
            System.out.println("B");
        } else if (score >= 40 ) {
            System.out.println("C");
        } else System.out.println("D");
    }
    public static void basic1069() {
        Scanner scanner = new Scanner(System.in);
        char grade = scanner.next().charAt(0);
        switch (grade) {
            case 'A' :
                System.out.println("best!!!");
                break;
            case 'B' :
                System.out.println("good!!");
                break;
            case 'C':
                System.out.println("run!");
                break;
            case 'D':
                System.out.println("slowly~");
                break;
            default:
                System.out.println("what?");
        }
    }
    public static void basic1070() {
        Scanner scanner = new Scanner(System.in);
        int season = scanner.nextInt();

        switch (season) {
            case 12: case 1: case 2:
                System.out.println("winter");
                break;
            case 3: case 4: case 5:
                System.out.println("spring");
                break;
            case 6: case 7: case 8:
                System.out.println("summer");
                break;
            default:
                System.out.println("fall");
        }
    }
    public static void basic1071() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int a = scanner.nextInt();
            if(a == 0){ break; }
            System.out.println(a);
        }
    }
    public static void basic1072() {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.println(scanner.nextInt());
        }
    }
    public static void basic1073() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int a = scanner.nextInt();
            if(a == 0){ break; }
            System.out.println(a);
        }
    }
    public static void basic1074() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        while (a>0){
            System.out.println(a);
            a -= 1;
        }
    }
    public static void basic1075() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        while (a != 0) {
            a -= 1;
            System.out.println(a);
        }
    }
    public static void basic1076() {
        Scanner scanner = new Scanner(System.in);
        char alphabet = scanner.next().charAt(0);
        char a = 'a';

        while (a <= alphabet) {
            System.out.println(a);
            a += 1;
        }
    }
    public static void basic1077() {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int zero = 0;
        while (zero <= i) {
            System.out.println(zero);
            zero += 1;
        }
    }
    public static void basic1078() {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int one = 1;
        int sum = 0;
        while (one <= i) {
            if (one % 2 == 0) {
                sum = sum + one;
            }
            one+=1;
        }
        System.out.println(sum);
    }
    public static void basic1079() {
        Scanner scanner = new Scanner(System.in);

        while (true){
            char c = scanner.next().charAt(0);
            if (c == 'q') {
                System.out.println(c);
                break;
            }
            System.out.println(c);
        }
    }
    public static void basic1080() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int i = 0;
        int sum = 0;

        while (sum < number) {
            i++;
            sum += i;
        }
        System.out.println(i);
    }

    // 11. 16. 1056~1060
    public static void basic1056() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.printf("%d", a != b ? 1 : 0);
    }
    public static void basic1057() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.printf("%d", a == b ? 1 : 0);
    }
    public static void basic1058() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.printf("%d", a==0 && b==0 ? 1 : 0);
    }

    // 비트단위 연산
    public static void basic1059() {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println(~i);
    }
    public static void basic1060() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a&b);
    }

    // 11. 15. 1041~1055
    public static void basic1041() {
        Scanner scanner = new Scanner(System.in);
        int before = scanner.next().charAt(0);
        char after = (char)(before + 1);
        System.out.println(after);
    }
    public static void basic1042() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a/b);
    }
    public static void basic1043() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a%b);
    }
    public static void basic1044() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        long result = (long)a + 1;
        System.out.println(result);
    }
    public static void basic1045() {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        long b = scanner.nextInt();

        System.out.printf((a+b) + "\n" + (a-b) + "\n" + (a*b) + "\n" + (a/b) + "\n" + (a%b) + "\n" + "%.2f", (float)a/b);
    }
    public static void basic1046() {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        long b = scanner.nextInt();
        long c = scanner.nextInt();

        long sum = a + b + c;
        float average = sum/(float)3;
        System.out.printf("%d%n%.1f", sum, average);
    }

    // 비트시프트 연산
    public static void basic1047() {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        System.out.println(a<<1);
    }
    public static void basic1048() {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a<<b);
    }
    public static void basic1049() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.printf("%d", a > b ? 1 : 0);
    }
    public static void basic1050() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.printf("%d", a == b ? 1 : 0);
    }
    public static void basic1051() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.printf("%d", b >= a ? 1 : 0);
    }
    public static void basic1052() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.printf("%d", a != b ? 1 : 0);
    }
    public static void basic1053() {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        System.out.printf("%d", value == 1 ? 0 : 1);
    }
    public static void basic1054() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.printf("%d", (a == 1 && b == 1) ? 1 : 0);
    }
    public static void basic1055() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.printf("%d", a == 1 || b == 1 ? 1 : 0);
    }


    // 11. 14. 1031~1040
    public static void basic1031() {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.printf("%o", i);
    }
    public static void basic1032() {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.printf("%x", i);
    }
    public static void basic1033() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Integer.toHexString(scanner.nextInt()).toUpperCase());
    }
    public static void basic1034() {
        // 8진수 -> 10진수
        Scanner scanner = new Scanner(System.in);
        System.out.println(Integer.parseInt(scanner.nextLine(), 8));
    }
    public static void basic1035() {
        Scanner scanner = new Scanner(System.in);
        int i = Integer.parseInt(scanner.nextLine(), 16);
        System.out.println(Integer.toOctalString(i));
    }
    public static void basic1036() {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextLine().charAt(0);
        System.out.println(i);
    }
    public static void basic1037() {
        Scanner scanner = new Scanner(System.in);
        char c = (char)scanner.nextInt();
        System.out.println(c);
    }

    // int 계산시 결과값 오버플로우가 되지 않게 업캐스팅 해줘야함
    public static void basic1038() {
        Scanner scanner = new Scanner(System.in);
        String sc = scanner.nextLine();
        long response = (long) Integer.parseInt(sc.split(" ")[0]) + (long) Integer.parseInt(sc.split(" ")[1]);
        System.out.println(response);
    }
    public static void basic1039() {
        Scanner scanner = new Scanner(System.in);
        String sc = scanner.nextLine();
        long l = Long.parseLong(sc.split(" ")[0]) + Long.parseLong(sc.split(" ")[1]);
        System.out.println(l);
    }
    public static void basic1040() {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int changeSign = i < 0 ? -i : -i;
        System.out.println(changeSign);
    }


    // 11. 10. 1021~1030
    public static void basic1021(){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(str);
    }
    public static void basic1022(){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(str);
    }
    public static void basic1023(){
        Scanner scanner = new Scanner(System.in);
        String[] str = Double.toString(scanner.nextDouble()).split("\\.");
        System.out.println(str[0]+"\n"+str[1]);
    }
    public static void basic1024(){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            System.out.println("\'" + c + "\'");
        }
    }
    public static void basic1025(){
        Scanner scanner = new Scanner(System.in);
        String x = Integer.toString(scanner.nextInt());

        for(int i=x.length(); i > 0; i--){
            // x 자리수 (x-x)번째 수 * 10의 x승 부터 출력
            int y = x.charAt(x.length() - i) - '0';
            int n = (int)Math.pow(10, i-1);
            System.out.println("[" + y*n + "]");
        }
    }
    public static void basic1026() {
        Scanner scanner = new Scanner(System.in);
        String minute = scanner.next().split(":")[1];

        if (minute.charAt(0) == '0') {
            System.out.println(minute.charAt(1));
        } else System.out.println(minute);
    }
    public static void basic1027(){
        Scanner scanner = new Scanner(System.in);
        String[] date = scanner.next().split("\\.");
        System.out.printf("%02d-%02d-%04d", Integer.parseInt(date[2]), Integer.parseInt(date[1]), Integer.parseInt(date[0]));
    }
    public static void basic1028(){
        // int 범위: -2147483648 ~ 2147483647
        Scanner scanner = new Scanner(System.in);
        long l = scanner.nextLong();
        System.out.println(l);

//        if (l > 2147483647 ){
//            long x = l % 2147483647;
//            System.out.println(2147483647 + x);
//        } else System.out.println(l);
    }
    public static void basic1029(){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%.11f", scanner.nextDouble());
    }
    public static void basic1030(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextLong());
    }


    // 11. 8. 1011~1020n ,
    public static void basic1011() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        while (input.length() >= 2) {
            System.out.println("한 글자만 입력해주세요");
            input = scanner.next();
        }

        char printOut = input.charAt(0);
        System.out.println(printOut);
    }
    public static void basic1012() {
        Scanner floatScanner = new Scanner(System.in);
        float f = floatScanner.nextFloat();
        System.out.printf("%f%n", f);
    }
    public static void basic1013() {
        Scanner scanner = new Scanner(System.in);
        int i1 = scanner.nextInt();
        int i2 = scanner.nextInt();
        System.out.printf("%d %d%n", i1, i2);
    }
    public static void basic1014() {
        Scanner scanner = new Scanner(System.in);
        char c1 = scanner.next().charAt(0);
        char c2 = scanner.next().charAt(0);
        System.out.printf("%c %c", c2, c1);
    }
    public static void basic1015() {
        Scanner scanner = new Scanner(System.in);
        float f = scanner.nextFloat();
        System.out.printf("%.2f", f);
    }
    public static void basic1017() {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.printf("%d %d %d", i, i, i);
    }
    public static void basic1018() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String s1 = s.split(":")[0];
        String s2 = s.split(":")[1];
//        System.out.println(s);
        System.out.printf("%s:%s%n", s1, s2);
    }
    public static void basic1019() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int year = Integer.parseInt(str.split("\\.")[0]);
        int month = Integer.parseInt(str.split("\\.")[1]);
        int day = Integer.parseInt(str.split("\\.")[2]);

        System.out.printf("%04d.%02d.%02d", year, month, day);
    }
    public static void basic1020() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int i1 = Integer.parseInt(str.split("-")[0]);
        int i2 = Integer.parseInt(str.split("-")[1]);

        System.out.printf("%06d%07d", i1, i2);
    }


    // 11. 3. 1001~1010
    public static void basic1001() {
        System.out.println("Hello");
    }
    public static void basic1002() {
        System.out.println("Hello World");
    }
    public static void basic1003() {
        System.out.println("Hello\nWorld");
    }
    public static void basic1004() {
        System.out.println("\'Hello\'");
    }
    public static void basic1005() {
        System.out.println("\"Hello World\"");
    }
    public static void basic1006() {
        System.out.printf("\"!@#$%%^&*()\"%n");
    }
    public static void basic1007() {
        System.out.println("\"C:\\Download\\hello.cpp\"");
    }
    public static void basic1008() {
//        System.out.printf("%c%c%c%n%c%c%c%n%c%c%c", '\u250C', '\u252C','\u2510','\u251C','\u253C','\u2524','\u2514', '\u2534','\u2518');
        System.out.printf("\u250C\u252C\u2510%n\u251C\u253C\u2524%n\u2514\u2534\u2518");
        System.out.printf("%n");
    }
    public static void basic1010() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n);

        // 제출시 Scanner import 안해주면 컴파일 에러 발생
    }
}
