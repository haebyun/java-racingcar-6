package racingcar.validator;

import java.util.List;

public class RacingCarInputValidator {
    public static void validateCarNames(List<String> carNames) {
        if (carNames == null || carNames.isEmpty()) {
            throw new IllegalArgumentException("자동차 이름은 반드시 입력해야 합니다.");
        }
        for (String carName : carNames) {
            if (carName.length() > 5) {
                throw new IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다.");
            }
        }
    }

    public static void validateRaceCount(String count) {
        try {
            int raceCount = Integer.parseInt(count);
            if (raceCount <= 0) {
                throw new IllegalArgumentException("시도 횟수는 1회 이상이어야 합니다.");
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("유효한 숫자를 입력해야 합니다.", e);
        }
    }
}
