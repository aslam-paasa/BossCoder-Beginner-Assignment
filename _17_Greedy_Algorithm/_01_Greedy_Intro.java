package _17_Greedy_Algorithm;

public class _01_Greedy_Intro {
    public static void main(String[] args) {
        /**
         * Greedy algorithm:
         * => Greedy algorithms is the problem solving technique where we can
         *    make the locally optimum choice at each stage & hope to achieve
         *    a global optimum.
         * 
         * 
         * Greedy means agar humaare paas koi problem hai aur hum usse
         * chote chote steps m solve kr rhe hai aur inn chote chote steps
         * ki help se humein finally ek final solution milne wala hai
         * to har chote step par hm ek greedy choice lenge.
         * Greedy choice means agar humaare paas choice hai ki itne
         * saare chije m pick kr skta hu solution m to mai apne hisaab se
         * best chij choose karunga means waha pe hm greedy ho jaenge.
         * Yaa to hm koi maximum value ko chase kr rhe honge yaa hm koi
         * minimum value ko chase kr rhe honge. Iss tarah harr step par
         * mujhe greedy choice leni hai.
         * 
         * Example: Hum recruit krne wali ek company k HR hai. Company
         * sbse pehle ek online test le legi. Maan lete hai 1000 students
         * ka online test liya. Usme se candidates shortlist hue aur
         * 100 students ko interview k liye bulaya. Next round m HR 
         * interview hua jisme 20 logo ko bulaya. And finally 10 logo ko
         * hire kiya:
         * 1. Round-1: Online test(1000)
         * 2. Round-2: Interview(100)
         * 3. Round-3: Interview HR(20)
         * 4. Final Selection: 10
         * 
         * Q. Bahut students aise hote hai jo coding m acche hote h but
         *    Online test m fail ho jaate hai. To company aisa q nhi krti
         *    ki 1000 students ka pehle test le, first interview kre and
         *    at last result declare kre? Sbko equal oppurtinity milni chaiye?
         * => Company yha pe thodi se greedy ho gyi hai. Qki iss approach m
         *    (a) time jyda lagega
         *    (b) effort jyda lgega
         *    (c) resource jyda lagega
         * => Kaafi contraint/limitation aa jaati hai jiske wajah se company
         *    saari solutions ko explore nhi krti. Isliye company ek greedy
         *    approach lgati hai, aur harr ek step par ek solution ko pick 
         *    kiya aur ye solution ko hm "local" solution bolte hai.
         * => Local Solution means har round ka solution alag hoga. Aur local
         *    solutions ko mila mila k humein global solution milta hai i.e.
         *    our final solution.  
         * 
         * Note: 
         * => Greedy Approach is generally used for optimization problems.
         *    Optimization problem uss tarike ki problem hai jisme humein
         *    yaa to uss problem ki final solution "min value ya max value"
         *    honi chaiye.
         * => Most of the greedy algorithm ya jo solution greedy algorithm ko
         *    mil k banti hai unke andr hum sorting ka use krte hai. Means
         *    pehle humein provided data ko sort krna hota hai, uske baad
         *    uspe koi code apply krte hai.
         * => Sorting Algorithms, Searching Algorithms etc ki apni ek fix
         *    approach/rule hoti hai but Greedy Algorithm ki koi fix rule nhi
         *    hoti hai. So, Greedy Algorithm ad-hoc basis pe chalti hai, means
         *    jis tarike ka problem hai waisa hi hm solution nikaalnge. 
         * 
         * 
         * Pros                               Cons:
         * 1. Simple & Easy                   1. A lot of time, global(final soln sahi nhi aata)
         * 2. Good Enough TC                  2. Optimum is not achieved
         * */ 
    }
}
