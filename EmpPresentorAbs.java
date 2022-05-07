package com;

public class EmpPresentorAbs {
    private static int WAGE_PER_HR =20;
    private static int FULL_DAY_HR =8;

    public boolean isEmpPres() {
        boolean ifEmpPres = false;
        double random_num = Math.random();
        System.out.println(random_num);
        if (random_num > 0 && random_num <= 0.5) {
            ifEmpPres = false;
        } else if (random_num > 0.5 && random_num < 1) {
            ifEmpPres = true;
        }
        return ifEmpPres;
    }
    public int dailyWage()
    {
        int daily_wage = 0;
        if (isEmpPres()) {
            daily_wage = WAGE_PER_HR * FULL_DAY_HR;
        } else {
            daily_wage = 0;
        }
        return daily_wage;
    }

    public static void main (String[]args){
        EmpPresentorAbs EmpPres = new EmpPresentorAbs();
        System.out.println("Today employee is present :" + EmpPres.isEmpPres());
        //System.out.println("Today's wage is :" + EmpPres.dailyWage());
    }
    }


