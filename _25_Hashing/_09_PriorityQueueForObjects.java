package _25_Hashing;

import java.util.PriorityQueue;

public class _09_PriorityQueueForObjects {
    /**
     * Agar humein objects store karane hue to uske liye ye
     * syntax hai.
     * Agar humein bahut saare students ka data diya hua hai aur iss
     * data ko humein PriorityQueue k andr add krna hai, uske liye
     * sbse pehle ek class bna lenge "Student" jiske andr hum apne
     * data ko define kr denge. Student k paas uska name aa jaega aur
     * uski rank. Fir ek constructor bna lenge jiske andr sbse pehle
     * student ka name aaega fir uska rank.
     * => Ab mujhe agar 5 student diye hai to harr student k paas uska
     *    naam aur rank v hai to hm kaise define krnge ki kn pehle
     *    aaega kn baad m aaega? Qki isme aisa kuch nhi likha hai jo
     *    humein bta rha ho ki humein student ko rank k basis pe 
     *    Priority deni hai. Ho skta hai mai alphabetlically arrange
     *    kr du, to jiska name A se start hoga uska admission pehle ho
     *    jae aur jiska rank Z se shuru ho rha uska admission last m
     *    ho jae. To aise cases mai classes k andr jb priority define 
     *    krni ho to humein implement krna hota hai ek special interface
     *    called Comparable. Aur isme hm compare krne wale hai Student
     *    class Objects ko i.e. Comparable<Student>.
     * => Student class ek interface ko implement kr legi. Aur comparable
     *    ek special power de deti hai apne classes ko jisse wo apne objects
     *    ko compare kr paegi. Ab ye Student class k upar hai, wo chahe to
     *    name k basis pe compare hogi ya rank k basis pe.
     * 
     * Q. Kaise compare krnge?
     * => Comparable interface k andr ek function hota hai jisko naam dete
     *    hai compareTo(). Aur interface k andr function hai to Student
     *    class ko v ussi fn ko implement krna hota hai.
     * => Jb ek parent class/interface k andr meri functions hoti hai aur 
     *    usko meri child class implement karein to uss concept of hm
     *    "function overriding" kehte the. Aur isi overriding ko hm implement
     *    karenge.
     * => compareTo() m hmein jiss chij ko compare krna hai usse as a
     *    parameter pass krnge i.e. compareTo(Student s2) and iske
     *    andr mention krnge kiske basis pe compare krna hai i.e.
     *    "this.rank - s2.rank;"
     * => Ye meri "this" apne aap m ek object hai(consider as s1).
     *    s2 v apne aap m ek object hai.
     * 
     *    s1    :   s2
     *    "abc"    "xyz"
     *     12       15
     * (a) Case-1: 
     *  => this.rank - s2.rank
     *  => 12 - 15 = -ve => -3
     * 
     *    s1    :   s2
     *    "abc"    "xyz"
     *     15       12
     * (b) Case-2: 
     *  => this.rank - s2.rank
     *  => 15 - 12 = +ve => +3
     * 
     *    s1    :   s2
     *    "abc"    "xyz"
     *     15       15
     * (b) Case-2: 
     *  => this.rank - s2.rank
     *  => 15 - 15 = 0 (equal)
     * 
     * => By default, Java k andr ye logic fixed hota hai ki agar
     *    compareTo() fn agar "0" return krta hai uska mtlb hota hai
     *    ki mere elements equal hai. Fir to s1 ko aage rkhe ya s2 ko
     *    fark nhi pdta
     * => Agar compareTe() fn +ve value return krta hai to uss case m
     *    1st element(this.obj1) > 2nd element(s2.obj2)
     *    Iss case m obj1 tb bda hoga jb iski priority high ho jaegi
     * => Agar compareTo() fn -ve value return krta hai to uss case m
     *    obj1 < obj2. Aur jb v sorting hogi aise cases ki tb s1 pehle
     *    aaega aur s2 baad m.
     * 
     * Ab maan lo mere paas bahut saare student aa jaate hai aur student
     * k paas apni rank hai:
     *   s1  s2   s3  s4   s5
     * +----------------------+
     * | 5 | 15 | 2 | 30 | 45 |
     * +----------------------+
     * Sbse pehle jb s1 ko s2 se compare kiya jaega to this.rank-s2.rank
     * m kya milega?
     * => this.rank - s2.rank
     * =>        5  - 15
     * => -10 (-ve) 
     * => s1 has high priority over s2
     * 
     * => this.rank - s3.rank
     * =>        5  - 2
     * => +3 (+ve)
     * => s3 has high priority over s1.
     * ....
     * ....
     * => Aise hi saare elements ek dusre se compare honge aur sorting
     *    ho rhi hogi to sorting hone k baad:
     *    => 2, 5, 15, 30, 45
     * */ 

    static class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("A", 4)); // O(logn)
        pq.add(new Student("B", 5));
        pq.add(new Student("C", 2));
        pq.add(new Student("D", 12));

        while(!pq.isEmpty()) {
            System.out.println(pq.peek().name + " => " + pq.peek().rank); // O(1)
            pq.remove(); // O(logn)
        }
    }

}
