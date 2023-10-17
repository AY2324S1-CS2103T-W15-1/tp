package profplan.testutil;

import static profplan.logic.commands.CommandTestUtil.VALID_ADDRESS_AMY;
import static profplan.logic.commands.CommandTestUtil.VALID_ADDRESS_BOB;
import static profplan.logic.commands.CommandTestUtil.VALID_EMAIL_AMY;
import static profplan.logic.commands.CommandTestUtil.VALID_EMAIL_BOB;
import static profplan.logic.commands.CommandTestUtil.VALID_NAME_AMY;
import static profplan.logic.commands.CommandTestUtil.VALID_NAME_BOB;
import static profplan.logic.commands.CommandTestUtil.VALID_PRIORITY_AMY;
import static profplan.logic.commands.CommandTestUtil.VALID_PRIORITY_BOB;
import static profplan.logic.commands.CommandTestUtil.VALID_TAG_FRIEND;
import static profplan.logic.commands.CommandTestUtil.VALID_TAG_HUSBAND;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import profplan.model.ProfPlan;
import profplan.model.task.Task;

/**
 * A utility class containing a list of {@code Task} objects to be used in tests.
 */
public class TypicalTasks {

    public static final Task ALICE = new TaskBuilder().withName("Alice Pauline")
            .withAddress("123, Jurong West Ave 6, #08-111").withEmail("alice@example.com")
            .withPriority("1")
            .withTags("friends").build();
    public static final Task BENSON = new TaskBuilder().withName("Benson Meier")
            .withAddress("311, Clementi Ave 2, #02-25")
            .withEmail("johnd@example.com").withPriority("2")
            .withTags("owesMoney", "friends").build();
    public static final Task CARL = new TaskBuilder().withName("Carl Kurz").withPriority("3")
            .withEmail("heinz@example.com").withAddress("wall street").build();
    public static final Task DANIEL = new TaskBuilder().withName("Daniel Meier").withPriority("4")
            .withEmail("cornelia@example.com").withAddress("10th street").withTags("friends").build();
    public static final Task ELLE = new TaskBuilder().withName("Elle Meyer").withPriority("5")
            .withEmail("werner@example.com").withAddress("michegan ave").build();
    public static final Task FIONA = new TaskBuilder().withName("Fiona Kunz").withPriority("6")
            .withEmail("lydia@example.com").withAddress("little tokyo").build();
    public static final Task GEORGE = new TaskBuilder().withName("George Best").withPriority("10")
            .withEmail("anna@example.com").withAddress("4th street").build();

    // Manually added
    public static final Task HOON = new TaskBuilder().withName("Hoon Meier").withPriority("1")
            .withEmail("stefan@example.com").withAddress("little india").build();
    public static final Task IDA = new TaskBuilder().withName("Ida Mueller").withPriority("5")
            .withEmail("hans@example.com").withAddress("chicago ave").build();

    // Manually added - Task's details found in {@code CommandTestUtil}
    public static final Task AMY = new TaskBuilder().withName(VALID_NAME_AMY).withPriority(VALID_PRIORITY_AMY)
            .withEmail(VALID_EMAIL_AMY).withAddress(VALID_ADDRESS_AMY).withTags(VALID_TAG_FRIEND).build();
    public static final Task BOB = new TaskBuilder().withName(VALID_NAME_BOB).withPriority(VALID_PRIORITY_BOB)
            .withEmail(VALID_EMAIL_BOB).withAddress(VALID_ADDRESS_BOB).withTags(VALID_TAG_HUSBAND, VALID_TAG_FRIEND)
            .build();

    public static final String KEYWORD_MATCHING_MEIER = "Meier"; // A keyword that matches MEIER

    private TypicalTasks() {} // prevents instantiation

    /**
     * Returns an {@code AddressBook} with all the typical tasks.
     */
    public static ProfPlan getTypicalProfPlan() {
        ProfPlan ab = new ProfPlan();
        for (Task task : getTypicalTasks()) {
            ab.addTask(task);
        }
        return ab;
    }

    public static List<Task> getTypicalTasks() {
        return new ArrayList<>(Arrays.asList(ALICE, BENSON, CARL, DANIEL, ELLE, FIONA, GEORGE));
    }
}
