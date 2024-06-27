package week13.Practikum2;

class BinaryTreeArray {
    int[] data;
    int idxLast;

    public BinaryTreeArray(int size) {
        data = new int[size];
        idxLast = -1;
    }

    public void populateData(int value) {
        if (idxLast < data.length - 1) {
            data[++idxLast] = value;
        }
    }

    public void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseInOrder(2 * idxStart + 1);
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2 * idxStart + 2);
        }
    }
}
