public class solution_DoubleLinkedList implements Comparable<solution_DoubleLinkedList> {

    private static final String DEFAULT_NAME = "Whatever";

    private String name;
    private Node head;
    private Node tail;
    private int size;

    /** Basic constructor */
    public solution_DoubleLinkedList(String name) {
        this.name = name;
        this.head = null;
        this.tail = null;
        this.size = 0;
    } // Basic constructor

    public solution_DoubleLinkedList() {
        this(DEFAULT_NAME);
    } // default constructor

    private static final String EMPTY = "The list is empty";
    private static final String FMT_HEADER = "The list has %d node(s).\n[ %s";
    private static final String FMT_NODE = ", %s";
    private static final String FMT_FOOTER = " ]";

    /**
     * String representation.
     * Introducting StringBuilder instead of plain Strings.
     */
    public String toString() {
        StringBuilder sb = new StringBuilder(EMPTY);
        if (this.size > 0) {
            sb = new StringBuilder(String.format(FMT_HEADER, this.size, this.head.getValue()));
            Node cursor = this.head.getNext();
            while (cursor != null) {
                sb.append(String.format(FMT_NODE, cursor.getValue()));
                cursor = cursor.getNext();
            }
            sb.append(FMT_FOOTER);
        }
        return sb.toString();
    } // method toString

    /** Add a new node to the linked list */
    public void add(Node node) {
        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.setNext(node);
            node.setPrevious(this.tail);
        }
        this.tail = node;
        this.size += 1;
    } // method add

    /**
     * Old-style add that traverses the list to find the last node. Not needed
     * anymore, because object field tail always points to the last node. The method
     * is preserved here for reference and should not be used -- it's declared
     * private to avoid exposure to object users.
     */
    private void sequantialAdd(Node node) {
        if (this.head == null) {
            this.head = node;
        } else {
            Node cursor = this.head;
            while (cursor.hasNext()) {
                cursor = cursor.getNext();
            }
            cursor.setNext(node);
            this.size++;
        }
    } // method sequantialAdd

    /**
     * This is method that calls the earlier add method and passes a newly created
     * node to it.
     */
    public void add(String value) {
        this.add(new Node(value));
    } // method add

    /** Straight forward accessor for size */
    public int getSize() {
        return this.size;
    } // method getSize

    /* Implements interface comparable. The list with the most vowels wins */
    public int compareTo(solution_DoubleLinkedList other) {
        int thisTotal = 0;
        int otherTotal = 0;
        int outcome = 1;
        if (other != null) {
            Node cursor = this.head;
            while (cursor != null) {
                thisTotal += this.countVowels(cursor.getValue());
                cursor = cursor.getNext();
            }
            cursor = other.head;
            while (cursor != null) {
                otherTotal += this.countVowels(cursor.getValue());
                cursor = cursor.getNext();
            }
            outcome = thisTotal - otherTotal;
        }
        return outcome;
    } // method compareTo

    /** Helper function to count the number of vowels in a node object. */
    private int countVowels(String string) {
        int count = 0;
        if (string != null) {
            String stringLower = string.toLowerCase();
            final String VOWELS = "aeiou"; // ok to omit y
            for (int i = 0; i < stringLower.length(); i++) {
                char c = stringLower.charAt(i);
                if (VOWELS.indexOf(c) > -1) {
                    count += 1;
                }
            }
        }
        return count;
    } // method countVowels
} // class solutions_DoubleLinkedList
