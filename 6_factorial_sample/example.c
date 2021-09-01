/* File : example.c */
/*example c file that contains factorial operation*/
 
 
 int fact(int n) {
     if (n <= 1) return 1;
     else return n*fact(n-1);
 }
 