package monsters;

import bases.Monster;
import utils.Dice;

public class Oak extends Monster {
	public Oak(String name,String weapon) {
		super(name,weapon);
		
		// ヒットポイントを70から130の間で設定
        this.setHp(Dice.get(70, 130));
        
        // 攻撃力を5から11の間で設定
        this.setOffensive(Dice.get(5, 11));
        
	}
}
