#this is my local repo 
<p>my 1st Repo</p>
<p>practicing my git hub skills</p>
<p>this is new feature</p>
<p>By Mistake</p>
<p>practicing my git hub skills</p>
<p>Hey i am back 1212</p>
<p>MANIFESATION AT 22 JAN 2025 </p>
<p>regular visit at 19/2/2025</p>
<p>regular visit after ISE 2</P>
<p>refular visit after ISE 3</p>
<p>on POE 6Th May 2015</p>
<p>Horros of BEEE</p>
<p>on 23Rd May 2025</p>
<p>AFTER END SEMESTER</p>
<p>on 7th june 2025</p>
<p>mission infosys 6.0</p>
<p>started 3 subjects</p>
<p>DSA nahi hora!!!</p>
<p>LAY zhop yayaliy</p>
<p>Deva Trip Nit Hou De Re Baba</p>
<p>Arrays Are Denger</p>
<p>Deva plz Plz Trip La Ghode Nako Lavu</p>
<p>Food Poisoing Done</p>
<p>Naldurg Trip Done</p>
<p>Naldurg Trip Done on @9june 2025</p>
<p>Watching infosys cource</p>
import java.util.Scanner;
public class Main {

    static void PrintArray(int [] arr){
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]+ " ");
        }
        System.out.println();
    }
    //
    static int [] ReverseArray  = ReverseArray(int [] arr){
        int n = arr.length;
        int [] ans = new int[n];
        int j = 0;
        //LOOP ULTA LAVNE//
        for (int i = n-1; i>=0; i--){
            ans[j++] = arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,2,3,4,5,6};
        int [] ans = ReverseArray(arr);
        PrintArray(ans);
    }
}

