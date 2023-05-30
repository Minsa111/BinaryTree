public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.NewNode( 20 );
        tree.NewNode( 2 );
        tree.NewNode( 25 );
        tree.NewNode( 37 );
        tree.NewNode( 16 );

        System.out.println("\nIn Order\t: ");
        tree.inOrder( tree.root );
        System.out.println("\nPost Order\t:");
        tree.postOrder( tree.root );
        System.out.println("\nPre Order\t: ");
        tree.preOrder( tree.root );
    }
}
