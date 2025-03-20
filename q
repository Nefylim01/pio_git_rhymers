[1mdiff --git a/src/main/java/edu/kis/vh/nursery/HanoiRhymer.java b/src/main/java/edu/kis/vh/nursery/HanoiRhymer.java[m
[1mindex ec0691f..eab568f 100644[m
[1m--- a/src/main/java/edu/kis/vh/nursery/HanoiRhymer.java[m
[1m+++ b/src/main/java/edu/kis/vh/nursery/HanoiRhymer.java[m
[36m@@ -2,7 +2,7 @@[m [mpackage edu.kis.vh.nursery;[m
 [m
 public class HanoiRhymer extends defaultCountingOutRhymer {[m
 [m
[31m-    int totalRejected = 0;[m
[32m+[m[32mint totalRejected = 0;[m
 [m
     public int reportRejected() {[m
         return totalRejected;[m
[36m@@ -11,7 +11,7 @@[m [mpublic class HanoiRhymer extends defaultCountingOutRhymer {[m
     public void countIn(int in) {[m
         if (!callCheck() && in > peekaboo())[m
             totalRejected++;[m
[31m-        else[m
[31m-            super.countIn(in);[m
[31m-    }[m
[32m+[m[32m            else[m
[32m+[m[32m                super.countIn(in);[m
[32m+[m[32m        }[m
 }[m
