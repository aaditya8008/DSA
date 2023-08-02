import java.util.*;

public class heapinsertion {
    static class heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            arr.add(data);
            int x = arr.size() - 1;
            int par = (x - 1) / 2;
            while (arr.get(x) < arr.get(par)) {
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
                x = par;
                par = (x - 1) / 2;
            }
        }

        public int peek() {
            return arr.get(0);
        }

        private void heapify(int i) {
            int l = 2 * i + 1;
            int r = 2 * i + 2;
            int minidx = i;
            if (l < arr.size() && arr.get(minidx) > arr.get(l)) {
                minidx = l;
            }
            if (r < arr.size() && arr.get(minidx) > arr.get(r)) {
                minidx = r;
            }
            if (minidx != i) {
                int temp = arr.get(i);
                arr.set(i, arr.get(minidx));
                arr.set(minidx, temp);
                heapify(minidx);
            }

        }

        public int remove() {
            int data = arr.get(0);
            // swap first &last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // delete last
            arr.remove(arr.size() - 1);
            heapify(0);
            return data;
        }

        public boolean isempty() {
            return arr.size() == 0;
        }

    }

    public static void main(String args[]) {
        heap h = new heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);
        while (!h.isempty()) {
            System.out.println(h.peek());
            h.remove();
        }

    }

}