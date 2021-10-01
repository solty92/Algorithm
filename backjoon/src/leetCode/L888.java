package leetCode;

class L888 {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
		
		int aliceSum = 0, bobSum = 0;

		for (int i : aliceSizes) {
			aliceSum += i;
		}

		for (int i : bobSizes) {
			bobSum += i;
		}

		int diff = (aliceSum - bobSum) / 2;

		for (int i = 0; i < aliceSizes.length; i++) {
			for (int j = 0; j < bobSizes.length; j++) {
				
				if(aliceSizes[i] - bobSizes[j] == diff){
					System.out.println(aliceSizes[i] + ", " + bobSizes[j]);
					return new int[]{aliceSizes[i], bobSizes[j]};
				}
			}
		}
		return null;
    }
}