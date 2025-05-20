import java.util.Random;

public class Employee {
    public static int[][] genEmpData(int numEmp) {
        Random random = new Random();
        int[][] empData = new int[numEmp][2];

        for (int i = 0; i < numEmp; i++) {
            empData[i][0] = 10000 + random.nextInt(90000);
            empData[i][1] = random.nextInt(11);
        }
        return empData;
    }

    public static double[][] calcB(int[][] empData) {
        int numEmp = empData.length;
        double[][] newSal = new double[numEmp][2];

        for (int i = 0; i < numEmp; i++) {
            double bonusPer = (empData[i][1] > 5) ? 0.05 : 0.02;
            double bonus = empData[i][0] * bonusPer;
            newSal[i][0] = empData[i][0] + bonus;
            newSal[i][1] = bonus;
        }
        return newSal;
    }

    public static void disRes(int[][] empData, double[][] newSal) {
        double ttlSal = 0, ttlNewSal = 0, ttlB = 0;

        System.out.printf("%-10s %-15s %-15s %-15s %-15s\n", "Emp ID", "Old Salary", "Years Service", "Bonus", "New Salary");

        for (int i = 0; i < empData.length; i++) {
            ttlSal += empData[i][0];
            ttlNewSal += newSal[i][0];
            ttlB += newSal[i][1];

            System.out.printf("%-10d %-15d %-15d %-15.2f %-15.2f\n",
                    (i + 1), empData[i][0], empData[i][1], newSal[i][1], newSal[i][0]);
        }

        System.out.printf("%-10s %-15.2f %-15s %-15.2f %-15.2f\n",
                "TOTAL", ttlSal, "", ttlB, ttlNewSal);
    }

    public static void main(String[] args) {
        int numEmp = 10;
        
        int[][] empData = genEmpData(numEmp);
        double[][] newSal = calcB(empData);
        
        disRes(empData, newSal);
    }
}
