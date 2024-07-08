package racingcar.view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import racingcar.util.ViewMessages;
import racingcar.validator.RacingCarInputValidator;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);

    public List<String> inputCarNames() {
        System.out.println(ViewMessages.PROMPT_CAR_NAMES);
        String carNames = scanner.nextLine();
        RacingCarInputValidator.validateCarNames(carNames);
        return splitCarNames(carNames);
    }

    private List<String> splitCarNames(String carNames) {
        return Arrays.asList(carNames.split(ViewMessages.PROMPT_CAR_NAMES_SEPARATOR));
    }

    public int inputRaceCount() {
        System.out.println(ViewMessages.PROMPT_RACE_COUNT);
        String count = scanner.nextLine();
        System.out.println();
        RacingCarInputValidator.validateRaceCount(count);
        return Integer.parseInt(count);
    }
}
