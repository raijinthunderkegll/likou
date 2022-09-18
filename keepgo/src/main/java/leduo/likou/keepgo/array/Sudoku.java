package leduo.likou.keepgo.array;

import java.util.HashSet;
import java.util.Set;

/**
 * 请你判断一个9 x 9 的数独是否有效。只需要 根据以下规则 ，验证已经填入的数字是否有效即可。
 *
 * 数字1-9在每一行只能出现一次。
 * 数字1-9在每一列只能出现一次。
 * 数字1-9在每一个以粗实线分隔的3x3宫内只能出现一次。（请参考示例图）
 *
 * 注意：
 *
 * 一个有效的数独（部分已被填充）不一定是可解的。
 * 只需要根据以上规则，验证已经填入的数字是否有效即可。
 * 空白格用'.'表示。
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode.cn/leetbook/read/top-interview-questions-easy/x2f9gg/
 */
public class Sudoku {

    public boolean isValidSudoku(char[][] board) {
        Set line = new HashSet();
        Set[] columnArray = new HashSet[9];
        Set[][] domainArray = new HashSet[3][3];

        for (int i = 0; i < board.length; i++) {
            line = new HashSet();
            for (int j = 0; j < board[i].length; j++) {
                // line校验
                if (checkAndAdd(board[i][j], line)) {
                    return false;
                }

                // column校验
                if(columnArray[j] == null){
                    columnArray[j] = new HashSet();
                }
                if (checkAndAdd(board[i][j], columnArray[j])) {
                    return false;
                }


                // domain校验
                int x = i / 3;
                int y = j / 3;

                if(domainArray[x][y] == null) {
                    domainArray[x][y] = new HashSet();
                }
                if (checkAndAdd(board[i][j], domainArray[x][y])) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean checkAndAdd(char element, Set set) {
        return element != '.' && !set.add(element);
    }
}

