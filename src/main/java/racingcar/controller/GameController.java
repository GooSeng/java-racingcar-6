package racingcar.controller;

import java.util.List;
import racingcar.util.CarNamesInputConverter;
import racingcar.util.NumberOfAttemptsInputConverter;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class GameController {
    private final InputView inputView;
    private final OutputView outputView;

    public GameController() {
        inputView = new InputView();
        outputView = new OutputView();
    }

    public void run() {
        initGame();
        // TODO
    }

    private void initGame() {
        List<String> carNames = inputCarNames();
        int numberOfAttempts = inputNumberOfAttempts();
    }

    private List<String> inputCarNames() {
        outputView.displayInputCarNames();
        String input = inputView.inputCarNames();
        return CarNamesInputConverter.convert(input);
    }

    private int inputNumberOfAttempts() {
        outputView.displayInputNumberOfAttempts();
        String input = inputView.inputNumberOfAttempts();
        return NumberOfAttemptsInputConverter.convert(input);
    }
}