import java.util.Stack;

class PageNode {
    String page;
    PageNode prev;
    PageNode next;

    PageNode(String page) {
        this.page = page;
        this.prev = null;
        this.next = null;
    }
}

class TabHistory {
    PageNode current;

    void visit(String page) {
        PageNode newPage = new PageNode(page);

        if (current != null) {
            current.next = null;
            newPage.prev = current;
            current.next = newPage;
        }

        current = newPage;
        System.out.println("Opened " + page);
    }

    void back() {
        if (current == null || current.prev == null) {
            System.out.println("No previous page");
            return;
        }

        current = current.prev;
        System.out.println("Back to " + current.page);
    }

    void forward() {
        if (current == null || current.next == null) {
            System.out.println("No next page");
            return;
        }

        current = current.next;
        System.out.println("Forward to " + current.page);
    }

    String getCurrentPage() {
        if (current == null) return null;
        return current.page;
    }
}

class TabManager {
    Stack<TabHistory> closedTabs;

    TabManager() {
        closedTabs = new Stack<>();
    }

    void closeTab(TabHistory tab) {
        closedTabs.push(tab);
        System.out.println("Tab closed");
    }

    TabHistory reopenTab() {
        if (closedTabs.isEmpty()) {
            System.out.println("No closed tabs");
            return null;
        }

        System.out.println("Tab reopened");
        return closedTabs.pop();
    }
}

public class BrowserBuddy {
    public static void main(String[] args) {

        TabHistory tab = new TabHistory();
        TabManager manager = new TabManager();

        tab.visit("google.com");
        tab.visit("github.com");
        tab.visit("stackoverflow.com");

        tab.back();
        tab.back();
        tab.forward();

        manager.closeTab(tab);

        TabHistory reopened = manager.reopenTab();
        if (reopened != null) {
            System.out.println("Current page: " + reopened.getCurrentPage());
        }
    }
}

