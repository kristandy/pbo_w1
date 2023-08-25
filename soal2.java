public class soal2
{
    public static void main(String[] args)
    {
        int i = 51;
        String s = (i<40)?"Life":(i>50)?"Universe":"Eveything";
        System.out.println(s);
    }
}

/*
 * Jika i kurang dari 40, Life akan masuk ke variabel s.
 * Jika i lebih dari 50, Universe akan masuk ke variabel s.
 * Jika tidak memenuhi kedua kondisi di atas, Everything akan masuk ke variabel s
 */