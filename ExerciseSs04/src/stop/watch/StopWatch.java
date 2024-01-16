package stop.watch;

import java.time.Instant;
import java.util.Random;

public class StopWatch {
    private long startTime;
    private long endTime;

    // Phương thức khởi tạo không tham số
    public StopWatch() {
        start(); // Gọi start() trong phương thức khởi tạo để thiết lập startTime
    }

    // Phương thức getter cho startTime
    public long getStartTime() {
        return startTime;
    }

    // Phương thức getter cho endTime
    public long getEndTime() {
        return endTime;
    }

    // Phương thức start để reset startTime về thời gian hiện tại của hệ thống
    public void start() {
        this.startTime = Instant.now().toEpochMilli();
    }

    // Phương thức stop để thiết đặt endTime về thời gian hiện tại của hệ thống
    public void stop() {
        this.endTime = Instant.now().toEpochMilli();
    }

    // Phương thức getElapsedTime để trả về thời gian đã trôi qua theo số millisecond
    public long getElapsedTime() {
        return endTime - startTime;
    }

    // Chương trình đo thời gian thực thi của thuật toán sắp xếp chọn
    public static void main(String[] args) {
        StopWatch stopwatch = new StopWatch(); // Tạo một đối tượng StopWatch

        // Tạo mảng ngẫu nhiên có 100,000 số
        int[] arr = RandomArray(100000);

        // Đo thời gian thực thi của thuật toán sắp xếp chọn
        stopwatch.start();
        selectionSort(arr);
        stopwatch.stop();

        // In thời gian thực thi
        System.out.println("Thời gian thực thi của thuật toán sắp xếp chọn: " + stopwatch.getElapsedTime() + " milliseconds");
    }

    // Phương thức sắp xếp chọn (Selection Sort)
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Hoán đổi giá trị của phần tử nhỏ nhất với phần tử đầu tiên chưa sắp xếp
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Phương thức tạo mảng ngẫu nhiên
    public static int[] RandomArray(int size) {
        int[] arr = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100000); // Giả sử giới hạn giá trị là 100,000
        }

        return arr;
    }
}
