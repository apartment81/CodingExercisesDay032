package ro.mirodone;

public class ArmstrongNumbers {

    public void armstrong() {

        for (int i = 1; i < 10; i++)//for the first digit
        {
            for (int n = 0; n < 10; n++) //for the middle digit
            {
                for (int c = 0; c < 10; c++) //for the third digit
                {
                    int a = i * 100 + n * 10 + c;// number generated
                    int b = i * i * i + n * n * n + c * c * c; // the sum of the digits cube

                    if (a == b) // if equal > Armstrong number
                    {
                        System.out.println(a);
                    }
                }
            }
        }
    }

}
