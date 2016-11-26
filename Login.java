import java.io.*;
import java.util.*;

// MODEL

public class Login extends Functions
{
    String userName;
    String passWord;
    while (!passCeck(userName,passWord))
    {

    }
    setuserName(userName);
    setpassWord(passWord);
}



class Register extends Functions
{
    Random random = new Random();
    Scanner in = new Scanner(System.in);
    private String type;
    private String name;
    private String DOB;
    private String address;
    private String dept;
    private String userName;
    private String passWord;

    public Register() {

        String id = generateRandom(random,"1234567890",5);
        while (!isUniqueID(id))
        {
            id = generateRandom(random,"1234567890",5);
        }
        setID(id);
        System.out.println("Enter type: ");
        type = in.next();
        while (!checkAdmin(type))
        {
            System.out.println("Admin exists, please enter again: ");
            type = in.next();
        }
        setType(type);
        System.out.println("Enter name: ");
        name = in.next();
        setName(name);
        System.out.println("Enter DOB: ");
        DOB = in.next();
        setDOB(DOB);
        System.out.println("Enter address: ");
        address = in.next();
        setAddress(address);
        System.out.println("Enter department: ");
        dept = in.next();
        if (type.equals("supervisor"))
        {
            while (!checkSuper(dept))
            {
                System.out.println(dept + " department supervisor already exists, please enter another department: ");
                dept = in.next();
            }

        }
        setDept(dept);
        System.out.println("Enter username: ");
        userName = in.next();
        while (!isUniqueuname(userName))
        {
            System.out.println("Username is taken, please enter again: ");
            userName = in.next();
        }
        setUserName(userName);
        System.out.println("Enter password: ");
        passWord = in.next();
        setPassWord(passWord);
        // write into file now
        Writefile("src/database.txt");

        System.out.println("ID: " + getID());
        System.out.println("Registration Successful !");

    }
}


class Functions extends User
{

    //1
    public static String generateRandom (Random rng, String characters, int length)
    {
        char[] text = new char[length];
        for (int i = 0; i < length; i++)
        {
            text[i] = characters.charAt(rng.nextInt(characters.length()));
        }
        return new String(text);
    }
    //2
    public boolean isUniqueID(String ID)
    {
        boolean b=true;
        String result = Readfile("src/database.txt");
        String line[] = result.split("\n");
        String words[];
        for (int i=0; i<line.length ; i++)
        {
            words = line[i].split(",");
            if (words[0].equals(ID))
            {
                b= false;
                break;
            }

        }
        return b;

    }
    //3
    public boolean isUniqueuname(String userName)
    {
        boolean b=true;
        String result = Readfile("src/database.txt");
        String line[] = result.split("\n");
        String words[];
        for (int i=0; i<line.length ; i++)
        {
            words = line[i].split(",");
            if (words[6].equals(userName))
            {
                b= false;
                break;
            }

        }
        return b;
    }

    //4
    public boolean checkAdmin(String type)
    {
        boolean b=true;
        String result = Readfile("src/database.txt");
        String line[] = result.split("\n");
        String words[];
        for (int i=0; i<line.length ; i++)
        {
            words = line[i].split(",");
            if (words[1].equals("admin") && words[1].equals(type))
            {
                b= false;
                break;
            }

        }
        return b;
    }
    //5
    public boolean checkSuper(String dept)
    {
        boolean b=true;
        String result = Readfile("src/database.txt");
        String line[] = result.split("\n");
        String words[];
        for (int i=0; i<line.length ; i++)
        {
            words = line[i].split(",");
            if (words[1].equals("supervisor") && words[5].equals(dept))
            {
                b= false;
                break;
            }

        }
        return b;
    }
    //6
    static String Readfile (String fname)
    {

        FileInputStream fstream = null;
        try {
            fstream = new FileInputStream(fname);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
        String strLine;
        String resultString = "";
        try {
            while ((strLine = br.readLine()) != null) {
               resultString+= strLine + "\r\n";
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return resultString;
    }
    //7
    public void Writefile (String fname)
    {
        String writeFile;
        String eol = System.getProperty("line.separator");
        writeFile = getID() + "," + getType() + "," + getName() + "," + getDOB() + "," + getAddress() + "," + getDept() + "," + getUserName() + "," + getPassWord() +eol;

        try
        {
            BufferedWriter out = new BufferedWriter (new FileWriter (fname,true));
            out.append(writeFile);
            out.close();
        }
        catch (IOException e)
        {
            System.out.println("Exception occured:  "+ e);
        }

    }
    //8
    public boolean passCheck(String userName, String passWord)
    {
        boolean b=false;
        String result = Readfile("src/database.txt");
        String line[] = result.split("\n");
        String words[];
        for (int i=0; i<line.length ; i++)
        {
            words = line[i].split(",");
            words[7] = words[7].replaceAll("\\r|\\n", "");
            if ((words[7].equals(passWord)) && (words[6].equals(userName)))
            {
                    b = true;
                    setID(words[0]);
                    setType(words[1]);
                    setName(words[2]);
                    setDOB(words[3]);
                    setAddress(words[4]);
                    setDept(words[5]);
                    break;
            }
            else
            {
                b = false;
                break;
            }

        }
        return b;
    }


}

