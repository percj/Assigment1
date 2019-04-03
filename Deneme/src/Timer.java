
public class Timer {
	private static long start;
    private static long end;
    private static boolean started;
 // Controlled timer is it stop 
    private static boolean isStopped() {
        return !started;
    }
 
                          //controlled timer is it started
    private static boolean isStarted() {
        return started;
    }
                        // Starts the timer.If it is already started timer give a error
    public static void start() {
        if (isStopped()) {
            startTimer();
        } else {
            throw new RuntimeException("Hata: Kronometre (Timer) zaten baþlatýlmýþ durumda!!!\n");
        }
    }
 
    private static void startTimer() {
        start = System.nanoTime();
        started = true;
    }
                   //It stopped timer . If it is already stopped timer give error
    public static void stop() {
        if (isStarted()) {
            stopTimer();
        } else {
            throw new RuntimeException("Hata: Kronometre (Timer) baþlatýlmadý!!!\n");
        }
    }
 
    private static void stopTimer() {
        end = System.nanoTime();
        started = false;
    }
 
   //  Timer.start() and Timer.stop() time between nanoseconds
    
    
    public static long getElapsedTime() {
        if (isStopped()) {
            return end - start;
        } else {
            throw new RuntimeException("Hata: Kronometre (Timer) durdurulmadý!!!\n");
        }
 
    }
 //  Timer.start() and Timer.stop() time between millisecond
    
    public static double getElapsedMilliseconds() {
        double seconds = (double) getElapsedTime() / 1000000.0;
        return seconds;
    }
//  Timer.start() and Timer.stop() time between seconds
   
    public static double getElapsedSeconds() {
        double seconds = (double) getElapsedTime() / 1000000000.0;
        return seconds;
}
}