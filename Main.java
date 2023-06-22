import java.util.Arrays;
import java.util.Scanner;

class ArrayUtils {
    public static boolean isNull(Object[] array) {
        for (Object element : array) {
            if (element != null) {
                return false;
            }
        }
        
        return true;
    }

    public static int[] addElementToArrayInt(int[] array, int value) {
        int[] newArray = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        newArray[array.length] = value;

        return newArray;
    }

    public static int[] editElementInArrayInt(int[] array, int index, int newValue) {
        if (index >= 0 && index < array.length) {
            array[index] = newValue;
        } else {
            System.out.println("Indeks tidak valid!");
        }

        return array;
    }

    public static String[] removeElementFromIndex(String[] arr, int index) {
        String[] newArr = new String[arr.length - 1];
        
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                newArr[j++] = arr[i];
            }
        }
        
        return newArr;
    }
    public static int[] removeElementFromIndexInt(int[] arr, int index) {
        int[] newArr = new int[arr.length - 1];
        
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                newArr[j++] = arr[i];
            }
        }
        
        return newArr;
    }

    public static int[] clearArrayInt(int[] array) {
        return new int[0];
    }
    public static String[] clearArrayString(String[] array) {
        return new String[0];
    }

    public static void printArrayInt(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length-1){
                System.out.print(array[i] + ".");
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println();
    }

    public static String[] addElementToArrayString(String[] array, String value) {
        String[] newArray = new String[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        newArray[array.length] = value;

        return newArray;
    }

    public static String[] editElementInArrayString(String[] array, int index, String newValue) {
        if (index >= 0 && index < array.length) {
            array[index] = newValue;
        } else {
            System.out.println("Indeks tidak valid!");
        }

        return array;
    }

    public static void printArrayString(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length-1){
                System.out.print(array[i] + ".");
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println();
    }

    public static void printArrayAll(String[] Array, int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(i+1+". ");
            if (i == array.length-1){
                System.out.println(Array[i] +" = " + array[i] + ".");
            } else if (array[i]==0 && Array[i]==null){
                System.out.println("Data Kosong!");
            } else {
                System.out.println(Array[i] +" = " + array[i] + ", ");
            }
        }
        System.out.println();
    }
}

// Implementasi Linear Search
class LinearSearch {
    int searchDuls(int arr[], int x, int t) {
        int N = arr.length-1;
        for (int i = x; i <= N; i++) {
            if (arr[i] == t)
                return i;
        }
        return -1;
    }
}

// Implementasi Shell Sort
class ShellSort {
    void shellSort(int[] arr) {
        int n = arr.length;
        int gap = n / 2;

        while (gap > 0) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j = i;

                while (j >= gap && arr[j - gap] > temp) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }

                arr[j] = temp;
            }

            gap /= 2;
        }
    }
}

// Implementasi Queue Array
class QueueArray {
    private int front, rear, size;
    private int capacity;
    private int[] array;

    public QueueArray(int capacity) {
        this.capacity = capacity;
        front = this.size = 0;
        rear = capacity - 1;
        array = new int[this.capacity];
    }

    boolean isFull(QueueArray queue) {
        return (queue.size == queue.capacity);
    }

    boolean isEmpty(QueueArray queue) {
        return (queue.size == 0);
    }

    void enqueue(int item) {
        if (isFull(this)){
            System.out.println("\nAntrian Penuh");
        } else {
            System.out.println("\nAntrian berhasil ditambah");
            rear = (rear + 1) % capacity;
            array[rear] = item;
            size = size + 1;
        }
    }

    int dequeue() {
        if (isEmpty(this))
            return 0;

        int item = array[front];
        front = (front + 1) % capacity;
        size = size - 1;

        return item;
    }

    boolean searchElement(int value) {
        for (int element : array) {
            if (element == value) {
                return true;
            }
        }
        return false;
    }

    int findIndex(int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        
        return -1; // Mengembalikan -1 jika nilai tidak ditemukan dalam array
    }

    int[] removeElementsByValue(int value) {
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != value) {
                array[j++] = array[i];
            }
        }
        size--;
        return Arrays.copyOf(array, j);
    }

    int isiQueue(){
        if (size<0){
            return 0;
        } else {
            return size;
        }
    }
}

// Implementasi Linked List
class Node {
    int data;
    Node prev;
    Node next;

    Node(int d) {
        data = d;
        prev = null;
        next = null;
    }
}

class Nodee {
    public String data;
    public Nodee next;

    public Nodee(String data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    private Nodee head;

    public LinkedList() {
        this.head = null;
    }

    public void insertAtEnd(String data) {
        Nodee newNode = new Nodee(data);
        if (head == null) {
            head = newNode;
        } else {
            Nodee current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void display() {
        Nodee current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("(kosong)");
    }
}

// Contoh penggunaan program guna mengatasi permasalahan serta membantu kinerja umkm Barbershop
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


                                                        // Implementasi Array
        String[] jasa = new String[0];
        String[] produk = new String[0];
        int[] pemasukan = new int[0];
        String[] barang = new String[0];
        int[] pengeluaran = new int[0];


                                                        // Implementasi Queue
        QueueArray queue = new QueueArray(200);
        int antrianPelanggan = 1;


                                                        // Implementasi Shell Sort
        ShellSort shellSort = new ShellSort();


                                                        // Implementasi Linear Search
        LinearSearch linearSearch = new LinearSearch();


                                                        // Implementasi Linked List
        LinkedList ll = new LinkedList();



        // Programs
        System.out.println("\n===============================");
        System.out.println("WELLCOME TO BARBERSHOP PROGRAMS");
        System.out.println("===============================\n");
        System.out.println("always grateful, and excited");

        boolean exit = false;
        while (!exit) {
            System.out.println("\n----------");
            System.out.println("Tindakan:");
            System.out.println("1. Tambah Antrean Pelanggan");
            System.out.println("2. Ambil Antrean Pelanggan");
            System.out.println("3. Hapus Antrean Pelanggan");
            System.out.println("4. Pemasukan");
            System.out.println("5. Pengeluaran");
            System.out.println("6. Sirkulasi Pelayanan");
            System.out.println("7. Kas Total");
            System.out.println("0. Tutup Program");
            System.out.print("Pilihan: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nPelayanan: ");
                    System.out.println("1. Pangkas");
                    System.out.println("2. Shaving");
                    System.out.println("3. Rebonding");
                    System.out.println("4. Coloring");
                    System.out.println("5. Treatment");
                    System.out.print("Pilihan: ");
                    int pilihanJasa = input.nextInt();
                    if (pilihanJasa==1){
                        queue.enqueue(antrianPelanggan);
                        jasa = ArrayUtils.addElementToArrayString(jasa, "Pangkas");
                        System.out.println("Jumlah Pengantre: " + queue.isiQueue());
                        antrianPelanggan++;
                    } else if (pilihanJasa==2){
                        queue.enqueue(antrianPelanggan);
                        jasa = ArrayUtils.addElementToArrayString(jasa, "Shaving");
                        System.out.println("Jumlah Pengantre: " + queue.isiQueue());
                        antrianPelanggan++;
                    } else if (pilihanJasa==3){
                        queue.enqueue(antrianPelanggan);
                        jasa = ArrayUtils.addElementToArrayString(jasa, "Rebonding");
                        System.out.println("Jumlah Pengantre: " + queue.isiQueue());
                        antrianPelanggan++;
                    } else if (pilihanJasa==4){
                        queue.enqueue(antrianPelanggan);
                        jasa = ArrayUtils.addElementToArrayString(jasa, "Coloring");
                        System.out.println("Jumlah Pengantre: " + queue.isiQueue());
                        antrianPelanggan++;
                    } else if (pilihanJasa==5){
                        queue.enqueue(antrianPelanggan);
                        jasa = ArrayUtils.addElementToArrayString(jasa, "Treatment");
                        System.out.println("Jumlah Pengantre: " + queue.isiQueue());
                        antrianPelanggan++;
                    } else {
                        System.out.println("Pilihan tidak valid");
                    }
                    break;
                case 2:
                    if(queue.isiQueue()!=0){
                        System.out.println("\nAntrean: " + queue.dequeue()+". "+jasa[0]);
                        ll.insertAtEnd(jasa[0]);
                        System.out.println("Jumlah Pengantre: " + queue.isiQueue());

                        produk = ArrayUtils.addElementToArrayString(produk, jasa[0]);
                        if (jasa[0]=="Pangkas"){
                        pemasukan = ArrayUtils.addElementToArrayInt(pemasukan, 30000);
                        } else if (jasa[0]=="Shaving"){
                            pemasukan = ArrayUtils.addElementToArrayInt(pemasukan, 25000);
                        } else if (jasa[0]=="Rebonding"){
                            pemasukan = ArrayUtils.addElementToArrayInt(pemasukan, 80000);
                        } else if (jasa[0]=="Coloring"){
                            pemasukan = ArrayUtils.addElementToArrayInt(pemasukan, 200000);
                        } else if (jasa[0]=="Treatment"){
                            pemasukan = ArrayUtils.addElementToArrayInt(pemasukan, 150000);
                        }
                        jasa = ArrayUtils.removeElementFromIndex(jasa, 0);

                    } else {
                        System.out.println("\nAntrean Kosong!");
                    }
                    break;
                case 3:
                    System.out.print("\nNomor Antrean yang akan dihapus: ");
                    int hapusAntrian = input.nextInt();
                    boolean cariAntrian = queue.searchElement(hapusAntrian);
                    if (queue.isiQueue()==0){
                        System.out.println("Antrean kosong!");
                    } else if (hapusAntrian<1){
                        System.out.println("Nomor Antrean harus >0 !");
                    } else if (cariAntrian==false){
                        System.out.println("Antrean Tidak Ditemukan!");
                    } else {
                        int indeksAntrian = queue.findIndex(hapusAntrian);
                        int indeksJasa = indeksAntrian;
                        System.out.println("Nomor Antrean "+hapusAntrian+". "+jasa[indeksJasa-1]+" Telah Dihapus!");
                            jasa = ArrayUtils.removeElementFromIndex(jasa, indeksJasa-1);
                        queue.removeElementsByValue(hapusAntrian);
                        System.out.println("Jumlah Pengantre: " + queue.isiQueue());
                    }
                    break;
                case 4:
                    boolean cekPemasukan = ArrayUtils.isNull(produk);
                    System.out.println("\n--------------------------------------------------------------");
                    System.out.println("Pemasukan hari ini (nominal dalam rupiah tanpa tanda pemisah): ");
                    if (cekPemasukan==true){
                        System.out.println("Data Pemasukan kosong!");
                    } else {
                        ArrayUtils.printArrayAll(produk,pemasukan);
                    }
                    Boolean keluar = false;
                    while (!keluar){
                        System.out.println("\n__________");
                        System.out.println("Opsi Aksi: ");
                        System.out.println("1. Tambah Data Pemasukan");
                        System.out.println("2. Cari Data Pemasukan");
                        System.out.println("3. Edit Data Pemasukan");
                        System.out.println("4. Hapus Data Pemasukan");
                        System.out.println("5. Sortir Data Pemasukan");
                        System.out.println("6. Kosongkan Pemasukan");
                        System.out.println("0. Kembali");
                        System.out.print("Pilihan: ");
                        int Pilihan = input.nextInt();

                        switch (Pilihan){
                            case 1:
                                System.out.println("\nPenambahan Data Pemasukan (nama produk tanpa spasi, nominal tanpa tanda pemisah): ");
                                System.out.print("Nama Produk  : ");
                                String namaProduk = input.next();
                                System.out.print("Harga Produk : ");
                                int harga = input.nextInt();
                                pemasukan = ArrayUtils.addElementToArrayInt(pemasukan, harga);
                                produk = ArrayUtils.addElementToArrayString(produk, namaProduk);
                                System.out.println("\n- Data Pemasukan setelah penambahan:\n");
                                ArrayUtils.printArrayAll(produk, pemasukan);
                                break;
                            case 2:
                                // int x = 9;
                                System.out.print("\nMasukkan nominal Pemasukan yang dicari : ");
                                int cariPemasukan = input.nextInt();
                                // Function call
                                int result = linearSearch.searchDuls(pemasukan,0 , cariPemasukan);

                                if(result == -1) {
                                    System.out.print("nominal "+cariPemasukan+" tidak ditemukan dalam Pemasukan\n");
                                } else {
                                    System.out.print("nominal "+cariPemasukan+" ditemukan di nomor :");
                                    for(int i=result; i<pemasukan.length-1; i++) {
                                        int nomorKetemu = result+1;
                                        System.out.print(" "+nomorKetemu);
                                        result = linearSearch.searchDuls(pemasukan, result+1, cariPemasukan); 
                                        if (result==-1) {
                                            System.out.println(".");
                                            break;
                                        } else if (i==pemasukan.length-1) {
                                            System.out.println(".");
                                            break;
                                        } else {
                                            System.out.print(",");
                                        }
                                    }
                                }
                                break;
                            case 3:
                                System.out.println();
                                ArrayUtils.printArrayAll(produk, pemasukan);
                                System.out.print("\nNomor Pemasukan yang ingin diedit: ");
                                int nomorEditPemasukan = input.nextInt();
                                System.out.print("Ketikan Nama baru (nama awal: "+produk[nomorEditPemasukan-1]+"): ");
                                String newName = input.next();
                                produk = ArrayUtils.editElementInArrayString(produk, nomorEditPemasukan-1, newName);
                                System.out.print("Ketikan Harga baru (harga awal: "+pemasukan[nomorEditPemasukan-1]+"): ");
                                int newPrice = input.nextInt();
                                System.out.println();
                                pemasukan = ArrayUtils.editElementInArrayInt(pemasukan, nomorEditPemasukan-1, newPrice);
                                System.out.println("\n- Data Pemasukan setelah pengeditan:");
                                ArrayUtils.printArrayAll(produk, pemasukan);
                                break;
                            case 4:
                                System.out.println();
                                ArrayUtils.printArrayAll(produk, pemasukan);
                                System.out.print("\nNomor data yang ingin dihapus: ");
                                int hapusPemasukan = input.nextInt();
                                int sizePemasukan = pemasukan.length;
                                if (hapusPemasukan >= 0 && hapusPemasukan < sizePemasukan) {
                                    System.out.println("Data pada nomor " + hapusPemasukan + " telah dihapus.");
                                    produk = ArrayUtils.removeElementFromIndex(produk, hapusPemasukan-1);
                                    pemasukan = ArrayUtils.removeElementFromIndexInt(pemasukan, hapusPemasukan-1);
                                    System.out.println("\n- Data Pemasukan setelah penghapusan:");
                                    ArrayUtils.printArrayAll(produk, pemasukan);
                                } else {
                                    System.out.println("Nomor yang dimasukkan tidak valid.");
                                }
                                break;
                            case 5:
                                System.out.println("\nPemasukan setelah penyortiran:");
                                shellSort.shellSort(pemasukan);
                                System.out.println(Arrays.toString(pemasukan));
                                break;
                            case 6:
                                pemasukan = ArrayUtils.clearArrayInt(pemasukan);
                                produk = ArrayUtils.clearArrayString(produk);
                                System.out.println("\n- Isi Data Pemasukan telah dikosongkan\n");
                                break;
                            case 0:
                                keluar = true;
                                break;
                            default:
                                System.out.println("\nPilihan tidak valid!");
                                break;
                        }
                    }
                    break;
                case 5:
                    boolean cekPengeluaran = ArrayUtils.isNull(barang);
                    System.out.println("\n--------------------------------------------------------------");
                    System.out.println("Pengeluaran hari ini (nominal dalam rupiah tanpa tanda pemisah): ");
                    if (cekPengeluaran==true){
                        System.out.println("Data Pengeluaran kosong!");
                    } else {
                        ArrayUtils.printArrayAll(barang,pengeluaran);
                    }
                    Boolean out = false;
                    while (!out){
                        System.out.println("\n___________");
                        System.out.println("Opsi Aksi: ");
                        System.out.println("1. Tambah Data Pengeluaran");
                        System.out.println("2. Cari Data Pengeluaran");
                        System.out.println("3. Edit Data Pengeluaran");
                        System.out.println("4. Hapus Data Pengeluaran");
                        System.out.println("5. Sortir Data Pengeluaran");
                        System.out.println("6. Kosongkan Pengeluaran");
                        System.out.println("0. Kembali");
                        System.out.print("Pilihan: ");
                        int Pilihan = input.nextInt();

                        switch (Pilihan){
                            case 1:
                                System.out.println("\nPenambahan Data Pengeluaran (nama barang tanpa spasi, nominal tanpa tanda pemisah): ");
                                System.out.print("Judul  : ");
                                String namaBarang = input.next();
                                System.out.print("Harga  : ");
                                int hargaBarang = input.nextInt();
                                pengeluaran = ArrayUtils.addElementToArrayInt(pengeluaran, hargaBarang);
                                barang = ArrayUtils.addElementToArrayString(barang, namaBarang);
                                System.out.println("\n- Data Pengeluaran setelah penambahan:\n");
                                ArrayUtils.printArrayAll(barang, pengeluaran);
                                break;
                            case 2:
                                // int x = 9;
                                System.out.print("\nMasukkan nominal Pengeluaran yang dicari : ");
                                int cariPengeluaran = input.nextInt();
                                // Function call
                                int result = linearSearch.searchDuls(pengeluaran,0 , cariPengeluaran);

                                if(result == -1) {
                                    System.out.print("nominal "+cariPengeluaran+" tidak ditemukan dalam Pengeluaran\n");
                                } else {
                                    System.out.print("nominal "+cariPengeluaran+" ditemukan di nomor :");
                                    for(int i=result; i<pengeluaran.length-1; i++) {
                                        int nomorKetemuu = result+1;
                                        System.out.print(" "+nomorKetemuu);
                                        result = linearSearch.searchDuls(pengeluaran, result+1, cariPengeluaran); 
                                        if (result==-1) {
                                            System.out.println(".");
                                            break;
                                        } else if (i==pengeluaran.length-1) {
                                            System.out.println(".");
                                            break;
                                        } else {
                                            System.out.print(",");
                                        }
                                    }
                                }
                                break;
                            case 3:
                                System.out.println();
                                ArrayUtils.printArrayAll(barang, pengeluaran);
                                System.out.print("\nNomor Pengeluaran yang ingin diedit: ");
                                int nomorEditPengeluaran = input.nextInt();
                                System.out.print("Ketikan Nama baru (nama awal: "+barang[nomorEditPengeluaran-1]+"): ");
                                String newNamee = input.next();
                                barang = ArrayUtils.editElementInArrayString(barang, nomorEditPengeluaran-1, newNamee);
                                System.out.print("Ketikan Harga baru (harga awal: "+pengeluaran[nomorEditPengeluaran-1]+"): ");
                                int newPricee = input.nextInt();
                                System.out.println();
                                pengeluaran = ArrayUtils.editElementInArrayInt(pengeluaran, nomorEditPengeluaran-1, newPricee);
                                System.out.println("\n- Data Pengeluaran setelah pengeditan:");
                                ArrayUtils.printArrayAll(barang, pengeluaran);
                                break;
                            case 4:
                                System.out.println();
                                ArrayUtils.printArrayAll(barang, pengeluaran);
                                System.out.print("\nNomor data yang ingin dihapus: ");
                                int hapusPengeluaran = input.nextInt();
                                int sizePengeluaran = pengeluaran.length;
                                if (hapusPengeluaran >= 0 && hapusPengeluaran < sizePengeluaran) {
                                    System.out.println("Data pada nomor " + hapusPengeluaran + " telah dihapus.");
                                    barang = ArrayUtils.removeElementFromIndex(barang, hapusPengeluaran-1);
                                    pengeluaran = ArrayUtils.removeElementFromIndexInt(pengeluaran, hapusPengeluaran-1);
                                    System.out.println("\n- Data Pengeluaran setelah penghapusan:");
                                    ArrayUtils.printArrayAll(barang, pengeluaran);
                                } else {
                                    System.out.println("Nomor yang dimasukkan tidak valid.");
                                }
                                break;
                            case 5:
                                System.out.println("\nPengeluaran setelah penyortiran:");
                                shellSort.shellSort(pengeluaran);
                                System.out.println(Arrays.toString(pengeluaran));
                                break;
                            case 6:
                                pengeluaran = ArrayUtils.clearArrayInt(pengeluaran);
                                barang = ArrayUtils.clearArrayString(barang);
                                System.out.println("\n- Isi Data Pengeluaran telah dikosongkan\n");
                                break;
                            case 0:
                                out = true;
                                break;
                            default:
                                System.out.println("\nPilihan tidak valid!");
                                break;
                        }
                    }
                    break;
                case 6:
                    System.out.println("\nSirkulasi Pelayanan Terkini :");
                    if (ll.isEmpty()==true){
                        System.out.println("Belum ada Pelayanan");
                    } else {
                        ll.display();
                    System.out.println();
                    }
                    break;
                case 7:
                    System.out.println("\n___________________");
                    System.out.println("Kas Total Terkini :");
                    int sum1 = 0;
                    int sum2 = 0;
                    for (int i = 0; i < pemasukan.length; i++) {
                        sum1 += pemasukan[i];
                    }
                    for (int j = 0; j < pengeluaran.length; j++) {
                        sum2 += pengeluaran[j];
                    }
                    int kasTerkini = sum1-sum2;
                    System.out.println("\nPemasukan   : " + sum1);
                    System.out.println("Pengeluaran : " + sum2);
                    System.out.println("............");
                    System.out.println("Kas Terkini : " + kasTerkini);
                    System.out.println();
                    break;
                case 0:
                    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("Program telah berhenti, see you next time!");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
                    input.close();
                    exit = true;
                    break;
                default:
                    System.out.println("\n-- Pilihan tidak valid! --\n");
                    break;
            }
        }
    }
}
