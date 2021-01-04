package lotto.view;

import lotto.domain.LottoCount;
import lotto.domain.WinningLotto;

import java.util.Scanner;

public class LottoInputView {
    private static final String INPUT_PRICE_MESSAGE = "구입금액을 입력해주세요.";
    private static final String INPUT_BEFORE_WIN_LOTTO_MESSAGE = "지난 주 당첨 번호를 입력해주세요.";
    private static final String INPUT_BONUS_MESSAGE = "보너스 볼을 입력해 주세요.";
    private static final Scanner SCANNER = new Scanner(System.in);

    public static LottoCount getLottoCount() {
        try {
            System.out.println(INPUT_PRICE_MESSAGE);
            return new LottoCount(SCANNER.nextLine());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getLottoCount();
        }
    }

    public static WinningLotto getWinningLotto() {
        try {
            System.out.println(INPUT_BEFORE_WIN_LOTTO_MESSAGE);
            String winningLottos = SCANNER.nextLine();

            System.out.println(INPUT_BONUS_MESSAGE);
            String bonus = SCANNER.nextLine();
            return new WinningLotto(winningLottos, bonus);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getWinningLotto();
        }
    }
}
