package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;
import racingcar.util.ViewMessages;
import racingcar.validator.RacingCarInputValidator;

public class InputView {
    public List<String> inputCarNames() {
        System.out.println(ViewMessages.PROMPT_CAR_NAMES);
        String carNames = Console.readLine();
        List<String> splitCarNames = splitCarNames(carNames);
        RacingCarInputValidator.validateCarNames(splitCarNames);
        return splitCarNames;
    }

    private List<String> splitCarNames(String carNames) {
        return Arrays.asList(carNames.split(ViewMessages.PROMPT_CAR_NAMES_SEPARATOR));
    }

    public int inputRaceCount() {
        System.out.println(ViewMessages.PROMPT_RACE_COUNT);
        String count = Console.readLine();
        System.out.println();
        RacingCarInputValidator.validateRaceCount(count);
        return Integer.parseInt(count);
    }
}
