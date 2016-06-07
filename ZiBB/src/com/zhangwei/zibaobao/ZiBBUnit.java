package com.zhangwei.zibaobao;

import java.util.ArrayList;
import java.util.List;

public class ZiBBUnit {
	public String A;
	public String B; //N为0时，A是key，B是value
	public int N;
	public ZiBBUnit(String A, String B, int N){
		this.A = A;
		this.B = B;
		this.N = N;
	}
	public String search(String input) {
		// TODO Auto-generated method stub
		boolean found = false;
		
		if(N==0){
			if(A!=null && A.contains(input)){
				found = true;
			}
		}else{
			if(A!=null && A.contains(input)){
				found = true;
			}
			
			if(B!=null && B.contains(input)){
				found = true;
			}
		}

		
		if(found){
			return toString();
		}else{
			return null;
		}
	}
	
	@Override
	public String toString(){
		if(N!=0){
			return "A面是" + A + ", B面是" + B + ", 在第" + N + "单元";
		}else{
			return B;
		}

	}
	
	public static List<ZiBBUnit> globeZBBs;
	static {
		globeZBBs = new ArrayList<ZiBBUnit>();
		globeZBBs.add(new ZiBBUnit("爸爸", "好", 1));
		globeZBBs.add(new ZiBBUnit("桌子", "洗碗", 4));
		globeZBBs.add(new ZiBBUnit("爷爷", "笑", 2));
		
		globeZBBs.add(new ZiBBUnit("猫鸡", "小猫叫，喵喵喵； 小鸡叫，叽叽叽； 你吃老鼠，我吃米。上边毛，下边毛，中间一个黑葡萄。母鸡骂小鸡，你这笨东西，教你咯咯叫，你偏叽叽叽。", 0));
		globeZBBs.add(new ZiBBUnit("鹅", "鹅，鹅，鹅，曲项向天歌；白毛浮绿水，红掌拨清波。", 0));
		globeZBBs.add(new ZiBBUnit("雨", "小雨说：滴答滴答，麦苗说：下吧下吧；青蛙说：呱呱呱呱，大家说：我要长大。", 0));
		globeZBBs.add(new ZiBBUnit("雨", "好雨知时节，当春乃发生。随风潜入夜，润物细无声。", 0));
		globeZBBs.add(new ZiBBUnit("花", "春眠不觉晓，处处闻啼鸟。夜来风雨声，花落知多少。", 0));
		globeZBBs.add(new ZiBBUnit("鹤", "白日依山尽，黄河入海流。欲穷千里目，更上一层楼。", 0));
		globeZBBs.add(new ZiBBUnit("豆", "吃豆豆，长肉肉。不吃豆豆，精瘦瘦。像小猴，好丑", 0));
		globeZBBs.add(new ZiBBUnit("竹", "竹笋芽，力气大，顶起石头，钻出脑瓜。节节往上爬，变竹啦。", 0));//。（下雨）
		globeZBBs.add(new ZiBBUnit("雨", "千条线，万条线，落进水里看不见", 0));
		globeZBBs.add(new ZiBBUnit("毛虫鸡", "树上掉下毛毛虫，我不怕，我叫小鸡吃了它。", 0));
		globeZBBs.add(new ZiBBUnit("鱼", "鱼儿小宝宝，水里吹泡泡，身子游呀游，尾巴摇呀摇。", 0));
		globeZBBs.add(new ZiBBUnit("象", "大象大象，鼻子长长，耳朵比脚大，身体像堵墙。", 0));
		globeZBBs.add(new ZiBBUnit("袋鼠", "小袋鼠，不害臊，走路还要妈妈报。 我有脚，自己走，妈妈夸我好宝宝。", 0));
		globeZBBs.add(new ZiBBUnit("驴鸭猫屁豆", "1,2,3,4,5 毛驴磨豆腐。鸭子翻跟斗，小猫晒屁股", 0));
		globeZBBs.add(new ZiBBUnit("鸟虫", "一群小鸟树上坐，叽叽喳喳把话说。一阵起，一阵落，商量害虫怎么捉。", 0));
		
		globeZBBs.add(new ZiBBUnit("企鹅", "三只企鹅一样高，走起路来摇啊摇。摇啊摇，它们南极去探宝。", 0));
		globeZBBs.add(new ZiBBUnit("灯影", "路灯高，路灯长，路灯底下走几趟。影子短，影子长，影子和我捉迷藏。", 0));
		globeZBBs.add(new ZiBBUnit("蜗牛", "说它是头牛，不拉犁头走。说它力气小，背着房子走。", 0));
		globeZBBs.add(new ZiBBUnit("萤火虫", "萤火虫，打灯笼，飞到西，飞到东 。纺织娘织布它照明，蚂蚁迷路它护送。萤虫闪光真美丽，它是夜里小明星。", 0));
		globeZBBs.add(new ZiBBUnit("猪象", "小猪胖胖，大象也胖，它俩一起，呵呵唱唱。它们的耳朵像蒲扇，它们的尾巴一个样。", 0));
		globeZBBs.add(new ZiBBUnit("老鼠猫", "小老鼠，上灯台，偷油吃，下不来，喵喵喵，猫来了，叽里咕噜滚下来。", 0));
		globeZBBs.add(new ZiBBUnit("眼睛嘴巴头肚脚耳", "谁的眼睛比嘴大，金鱼的眼睛比嘴大。谁的嘴巴比头大，河马的嘴巴比头大。谁的头比肚子大，蜻蜓的头比肚子大。谁的耳朵比脚大，大象的耳朵比脚大。", 0));
		globeZBBs.add(new ZiBBUnit("请", "“请”字像个小银铃，说起话来真好听。请你别客气，请你等一等，请你帮帮忙，请问几点钟。你也请呀，我也请，讲究礼貌真文明。", 0));
		globeZBBs.add(new ZiBBUnit("星", "仰起头，数星星，数数天上北斗星，一二三四五六七，七颗星，亮晶晶。七六五四三二一，斗口指着北极星，天南海北指方明。", 0));
		globeZBBs.add(new ZiBBUnit("孙悟空猪八戒", "唐僧取经咚那个咚，后面跟着个孙悟空。孙悟空，跑得快，后面跟着个猪八戒。猪八戒，嘴巴长，后面跟着个沙和尚。师徒西天取经去，妖魔鬼怪一扫光。", 0));
		globeZBBs.add(new ZiBBUnit("孙悟空猪八戒", "你挑着担，我牵着马，迎来日出送走晚霞。踏平坎坷成大道，斗罢艰险又出发，又出发。啦……啦……一番番春秋冬夏。一场场酸甜苦辣。敢问路在何方，路在脚下。敢问路在何方，路在脚下。", 0));
		globeZBBs.add(new ZiBBUnit("河", "小河，小河，你告诉我：你唱的什么歌？你从哪里来，你到哪里去？为什么急急地走着，一歇也不歇？小河轻轻的说，我唱的是快乐的歌，我从大山上来，雨水来找我，雪水来找我，我们手拉手，到大海里去做客。", 0));
		globeZBBs.add(new ZiBBUnit("蚂蚁地图", "小蚂蚁，真淘气，爬上我家地球仪。从上海，到伦敦，逛纽约，游巴黎。英国荷兰圭亚那，刚果咋得索马里。游遍欧美亚非拉，足记遍布南北极。", 0));

	}

}
