package profplan.logic.commands;

import static profplan.logic.commands.CommandTestUtil.assertCommandSuccess;

import org.junit.jupiter.api.Test;

import profplan.model.Model;
import profplan.model.ModelManager;
import profplan.model.ProfPlan;
import profplan.model.UserPrefs;
import profplan.testutil.TypicalPersons;

public class ClearCommandTest {

    @Test
    public void execute_emptyProfPlan_success() {
        Model model = new ModelManager();
        Model expectedModel = new ModelManager();

        assertCommandSuccess(new ClearCommand(), model, ClearCommand.MESSAGE_SUCCESS, expectedModel);
    }

    @Test
    public void execute_nonEmptyProfPlan_success() {
        Model model = new ModelManager(TypicalPersons.getTypicalProfPlan(), new UserPrefs());
        Model expectedModel = new ModelManager(TypicalPersons.getTypicalProfPlan(), new UserPrefs());
        expectedModel.setProfPlan(new ProfPlan());

        assertCommandSuccess(new ClearCommand(), model, ClearCommand.MESSAGE_SUCCESS, expectedModel);
    }

}
