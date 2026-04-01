
class ParcelTracker {
    static class Stage {
        String name;
        Stage next;

        Stage(String name) {
            this.name = name;
            this.next = null;
        }
    }
    Stage head;
    void addStage(String stageName) {
        Stage newStage = new Stage(stageName);

        if (head == null) {
            head = newStage;
            return;
        }

        Stage temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newStage;
    }
    void trackParcel() {
        if (head == null) {
            System.out.println("Parcel stages are missing!");
            return;
        }

        Stage temp = head;
        System.out.println("Parcel Tracking:");
        while (temp != null) {
            System.out.println("-> " + temp.name);
            temp = temp.next;
        }
    }
    void addCheckpoint(String afterStage, String checkpointName) {
        Stage temp = head;

        while (temp != null) {
            if (temp.name.equals(afterStage)) {
                Stage checkpoint = new Stage(checkpointName);
                checkpoint.next = temp.next;
                temp.next = checkpoint;
                return;
            }
            temp = temp.next;
        }

        System.out.println("Stage '" + afterStage + "' not found. Cannot add checkpoint.");
    }
    public static void main(String[] args) {
        ParcelTracker tracker = new ParcelTracker();
        tracker.addStage("Packed");
        tracker.addStage("Shipped");
        tracker.addStage("In Transit");
        tracker.addStage("Delivered");
        tracker.trackParcel();
        System.out.println("\nAdding a custom checkpoint 'Custom Checkpoint' after 'Shipped'");
        tracker.addCheckpoint("Shipped", "Custom Checkpoint");
        tracker.trackParcel();
    }
}
