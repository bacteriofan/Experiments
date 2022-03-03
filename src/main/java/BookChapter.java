public class BookChapter {
    public static String nearestChapter(Chapter[] chapter, int page) {
        String result = null;
        for (int i = 0; i < chapter.length - 1; i++) {
            if (chapter[i].getPage() < page && chapter[i + 1].getPage() > page) {
                int cl = page - chapter[i].getPage();
                int cl2 = chapter[i + 1].getPage() - page;
                if (cl > cl2 || cl == cl2) {
                    result = chapter[i + 1].getName();
                } else {
                    result = chapter[i].getName();
                }
            }
        }
        return result;
    }

    static class Chapter {
        private String name;
        private int page;

        public Chapter(String name, int page) {
            this.name = name;
            this.page = page;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPage() {
            return page;
        }

        public void setPage(int page) {
            this.page = page;
        }
    }
}