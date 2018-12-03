/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package programmingtest;

import java.util.Arrays;

/**
 *
 * @author LADY
 */
public class ProgrammingTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Prime Count: "+primeCount(-10, 6));
        System.out.println("is Madhav Array: "+isMadhavArray(new int[]{2, 1, 1, 4, -1, -1}));
        System.out.println("Inertial Array: "+inertialArray(new int[]{2, 12, 12, 4, 6, 8, 11}));
        System.out.println("Square Pair: "+countSquarePairs(new int[]{11, 5, 4, 20} ));
        System.out.println("Next Prime: "+findPorcupineNumber(139));
        System.out.println("is Guthrie Sequence: "+isGuthrieSequence(new int[]{8, 4, 2, 1}));
        System.out.println("Stanton Measure: "+stantonMeasure(new int[]{1, 4, 3, 2, 1, 2, 3, 2}));
        System.out.println("Sum Factor: "+sumFactor(new int[]{3, 0, 2, -5, 0}));
        System.out.println("Guthrie Index: "+guthrieIndex(42));
       // System.out.println("Facto: "+facto(10));
      //  System.out.println("Facto of Y: "+facto(125131));
        //System.out.println("Defactorial: "+isDefacto(8));
        System.out.println("Solve10: "+Arrays.toString(solve10()));
        System.out.println("repsEqual: "+repsEqual(new int[]{3, 2, 0, 5, 3}, 32053));
        System.out.println("Is Centered 15: "+isCentered15(new int[]{3, 2, 10, 4, 1, 6, 9}));
        System.out.println("Henry: "+henry(1, 3));
        System.out.println("Is divisible: "+isDivisible(new int[]{3, 3, 6, 36}, 3));
        System.out.println("Is N unique: "+isNUnique(new int[]{7, 3, 3, 2, 4},11));
        System.out.println("Is Square: "+isSquare(25));
        System.out.println("Is Legal Number: "+isLegalNumber(new int[]{3, 2, 4}, 4));
        System.out.println("Convert To Base 10: "+convertToBase10(new int[]{1, 1, 2}, 3));
        System.out.println("Matches: "+matches(new int[] {1,  2,  3, -5, -5,  2, 3, 18}, new int[] {3, -2, 3}));
        System.out.println("Is Stacked: "+isStacked(15));
        System.out.println("Is Sum Safe: "+ isSumSafe(new int[] {5, -4, 2}));
        System.out.println("Isolated Number: "+isIsolated(14));
        System.out.println("Is Vanilla: "+isVanilla(new int[]{9, 999, 99999, -9999}));
        System.out.println("Trivial Array: "+isTrivalent(new int[] {22, 19, 10, 10, 19, 22, 22, 10}));
    }
    private static int primeCount(int start,int end){
        int count = 0;
        for(int i = start;i <= end;i++){
       
            if(isPrime(i)) count++;
            
        }
        return count;
    }

    private static boolean isPrime(int num) {
        if(num == 2) return true;
        if(num<2 || num%2 == 0) return false;
        for(int i = 3;i*i <= num;i+=2){
            if(num%i == 0) return false;
        }
        return true;
    }
    
    private static int isMadhavArray(int[] a){
        int sum1 = a[0],sum2;
        for(int i = 1;i<i*(i+1)/2;i++){
            sum2 = 0;
            for(int j = i*(i+1)/2;j<a.length && j<(i+1)*(i+2)/2;j++){
               sum2 += a[j];
            }
            if(sum1 != sum2)return 0;
        }
        return 1;
    }
    private static int inertialArray(int[] a){
        int max = a[0];
        int count = 0;
        for(int e:a){
            if(e%2 == 1) count++;
            if(e>max) max = e;
        }
        for(int i = 0;i<a.length;i++){
            for(int j = 1;j<a.length;j++){
                if(a[i]%2 == 1 && a[j]%2 == 2 && a[j]%2 != max){
                    if(a[j] > a[i]) return 0;
                }
            }
        }
        if(count>0 && max%2 == 0) return 1;
        return 0;
    }
    private static int countSquarePairs(int[] a){
        int count = 0;
        //a = new int[]{9, 0, 2, -5, 7};
        int n  = 0,m = 0;
        if(a.length < 2) return 0;
        for(int i = 0;i<a.length;i++){
            n = a[i];
            for(int j = 0;j<a.length;j++){
                m = a[j];
                if(isPerfectSquare(n+m) && n < m){
                    count++;
                }
                    
            }
        }
        return count;
    }

    private static boolean isPerfectSquare(int i) {
        return (int) Math.sqrt(i) == Math.sqrt(i);
    }
    private static int findPorcupineNumber(int n){
        boolean flag = true;
        ++n; 
        
        while(true){
            n++;
            if(isPrime(n) && 9 == n%10){
                if(flag){
                    while(true){
                        if(isPrime(n) && n%10 == 9){
                            flag = false;
                            break;
                        }
                        n++;
                    }                    
                }
                if(!flag){
                    if(isPrime(nextPrime(n)) && nextPrime(n)%10 == 9) return n;
                    else flag = true;
                }
            }
        }
    }    

    private static int nextPrime(int n) {
        ++n;
        while(true)
            if(!isPrime(n))n++;
            else return n;
    }
    private static int isGuthrieSequence(int[] a){
        for(int i = 0;i<a.length-1;i++){
            if(a[i]%2 == 0 && a[i+1] != a[i]/2)return 0;
            else if(a[i]%2 == 1 && a[i+1] != 3*a[i]+1)return 0;
        }
        if(a[a.length-1] == 1)return 1;
        else return 0;
    }
    private static int stantonMeasure(int[] a){
        int n = 0,count = 0;
        for(int e:a){
            if(e == 1)n++;
        }
        for(int e:a){
            if(e == n)count++;
        }
        return count;
    }
    private static int sumFactor(int[] a){
        int sum = 0,count = 0;
        for(int e:a){
            sum += e;
        }
        for(int e:a){
            if(e == sum)count++;
        }
        return count;
    }
    private static int guthrieIndex(int n){
        int count = 0;
        while(n != 1){
            if(n%2 == 0)n = n/2;
            else n = 3*n+1;
            count++;
            if(n == 1) return count;
        }
        return 0;
    }
    private static int[] solve10(){
        int x = 0;
        int y = 10;
        while(x<10){
            if(y>=0) y--;
            if(facto(y) + facto(x) == facto(10)){
                return new int[]{x,y};
            }
            x++;
        }
        return new int[]{0,0};
    }

    private static int facto(int x) {
        if(x == 0 || x == 1) return 1;
        return x*facto(x-1);
    }

    private static int isDefacto(int n) {
        int a = 1,b = 2,m = n;
        while(a < n){
            if(n%a == 0){
                n /=a; 
            }else return 0;
            a++;
            b = a+1;
        }
        if(n == m) return 0;
        return a;
    }
    
    private static int repsEqual(int[] a, int n){
        int rev[] = new int[String.valueOf(n).toCharArray().length];
        int j = 0;
        while(n > 0){
            rev[j] = n%10;
            n /= 10; 
            j++;
        }
        if(a.length != rev.length) return 0;
        for(int k = 0;k<a.length;k++){
            if(a[k] != rev[a.length-1-k]) return 0;
        }
        return 1;
    }
    private static int isCentered15(int[] a){
        int sum;
        for(int i = 0;i<a.length;i++){
            sum = 0;
            for(int j = i;j<a.length-i;j++){
                sum += a[j];
                if(sum == 15) return 1;
            }
        }
        return 0;
    }
    private static int henry(int first,int second){
        int c1 = 0,c2 = 0;
        int num = 6;
        boolean flag = true;
        int temp1 = 0,temp2;
        while(true){
            if(isPerfect(num) && flag){
                c1++;
                if(c1 == first){
                    temp1 = num;
                    flag = false;
                }
            }
            if(isPerfect(num) && !flag){
                c2++;
                if(c2 == second){
                    temp2 = num;
                    return temp1+temp2;
                }
            }
            num++;
        }
    } 
    private static boolean isPerfect(int num){
        if(num == 1) return false;
        int sum = 1,min = num;
        for(int i = 2;i< min;i++){
            if(num%i == 0)sum += i+(num/i);
            min = Math.min(min, num/i);
            if(sum>num) return false;
        }
        return sum == num;
    }
    private static int isDivisible(int [] a, int divisor){
        for(int e:a){
            if(Math.floor(e/divisor) != Math.ceil(e/divisor)) return 0;
        }
        return 1;
    }    
    private static int isNUnique(int[] a,int n){
        int count = 0;
        if(a.length < 2) return 0;
        for(int i = 0;i<a.length;i++){
            for(int j = 1;j<a.length;j++){
                if(a[i] + a[j] == n) count++;
            }
            if(count == 1)return 1;
        }
        return 0;
    }
    @SuppressWarnings("empty-statement")
    private static int isSquare(int n){
        if(n < 0) return 0;
        double i,precision = 10E-6;
        for(i = 1;i*i<=n;i++);
        for(--i;i*i<n;i+=precision);
        if((int) i == i)return 1;
        return 0;
                
        
    }
    private static int isLegalNumber(int[] a, int n){
        for(int e:a)
            if(e>=n) return 0;
        return 1;
    }
    private static int convertToBase10(int[ ] a, int base){
        int sum = 0;
        if(isLegalNumber(a, base) == 0) return 0;
        for(int i = a.length-1,j = 0;i>=0;i--,j++)
            sum += a[i] * Math.pow(base, j);
        return sum;
    }
    private static int matches(int[] a, int[] p){
        int j = 0;
        for(int i = 0;i<p.length;i++){
            for(;j<Math.abs(p[i]);j++){
                if(p[i] < 0){
                    if(a[j] > 0) return 0;
                }else{
                    if(a[j] < 0) return 0;
                }  
            }
            j = Math.abs(p[i]-1);
        }
        return 1;
    }
    private static int isStacked(int n){
        int sum = 0,i=1;
        while(sum < n){
            sum += i++;
            if(sum == n) return 1;
        }
        return 0;
    }
    private static int isSumSafe(int[ ]a){
        int sum = 0;
        for(int e:a)sum += e;
        heapSort(a);
        if(binarySearch(a, 0, a.length-1, sum))return 0;
        return 1;
    }
    public static void heapSort(int[] a){
        int len = a.length;
        for(int i = len/2 - 1;i>=0;i--)
            heapify(a,len,i);
        for(int i = len-1;i>=0;i--){
            exchange(a,i,0);
            heapify(a,i,0);
        }
    } 

    public static void heapify(int[] a, int len, int i) {
        int largest = i;
        int left  = 2*i + 1;
        int right = 2*i + 2;
        if(left < len && a[left] > a[largest]) largest = left;
        if(right < len && a[right] > a[largest]) largest = right;
        if(largest != i){
            exchange(a,i,largest);
            heapify(a,len,largest);
        }
    }

    private static void exchange(int[] a, int i, int j) {
       int temp = a[i];
           a[i] = a[j];
           a[j] = temp;
    }   
    private static boolean binarySearch(int[] a,int left,int right,int e){
       if(right >= left){
            int mid = left + (right-left)/2;
            if(a[mid] == e)return true;
            if(a[mid] > e) return binarySearch(a, left, mid-1, e);
            else return binarySearch(a, mid+1, right, e);
       }
       return false;     
    }
    private static int isIsolated(long n){
        if(n>2097151 || n<1) return -1;
        long sqrt = n*n;
        long cb = n*n*n;
        while(sqrt > 0){
            long t = sqrt%10;
            long cbrt = cb;
            while(cb > 0){
                long m = cb%10;
                if(t == m) return 0;
                cb /= 10;
            }
            sqrt /= 10;
            cb = cbrt;
        }
        return 1;
//        char[] square = String.valueOf(n*n).toCharArray();
//        char[] cube = String.valueOf(n*n*n).toCharArray();;
//        int min = (square.length < cube.length) ? square.length : cube.length;
//        char[] a,b;
//        if(square.length == min){
//            a = square;
//            b = cube;
//        }else{
//            a = cube;
//            b = square;
//        }
//        for(int i = 0;i<a.length;i++){
//            for(int j = 0;j<b.length;j++){
//                if(a[i] == b[j]) return 0;
//            }
//        }
//        return 1;
//        
    }
    private static int isVanilla(int[] a){
        if(a.length == 0)return 1;
        char a0 = String.valueOf(a[0]).toCharArray()[0];
        for(int e:a){
            char[] array = String.valueOf(e).toCharArray();
            for(char c:array){
                if(c != a0 && c != '-') return 0;
            }
        }
        return 1;
    }
    private static int isTrivalent(int[] a){
        int i = 1;
        int temp1 = a[0],temp2 = 0,temp3 = 0;
        boolean flag1 = false,flag2 = false;
        while(true){
            if(temp1 != a[i] && !flag1){
                temp2 = a[i];
                flag1 = true;
            }
            else if(temp1 != a[i] && temp2 != a[i] && flag1){
                temp3 = a[i];
                flag2 = true;
            }        
            if(flag1 && flag2){
                for(int e:a)
                    if(e != temp1 && e != temp2 && e != temp3)return 0;
                return 1;
            }
            i++;
        }
    }
}
