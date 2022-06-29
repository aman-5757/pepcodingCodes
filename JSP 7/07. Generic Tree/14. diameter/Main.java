//diameter of a generic subtree
    static int dia;
    public static void diameter(Node root) {
        dia = 0;
        height(root);
    }

    public static int height(Node node) {
        int chbht = -1;
        int chsbht = -1;

        for (int i = 0; i < node.children.size(); i++) {
            Node child = node.children.get(i);
            int cht = height(child);

            if (cht > chbht) {
                chsbht = chbht;
                chbht = cht;
            } else if (cht > chsbht) {
                chsbht = cht;
            }
        }

        int dist = chbht + chsbht + 2;

        if (dist > dia) {
            dia = dist;
        }

        return chbht + 1;
    }

