
public class SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,5,6};
		int target = 0;

		int answer = searchInsert(nums, target);

		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i]);
		}
		System.out.println("\nTarget: "+target);
		System.out.print("Index: "+answer);

	}

	public static int searchInsert(int[] nums, int target) {
		for(int i=0; i<nums.length; i++) {
			if(nums[i] == target) {
				return target = i;
			}
			else if(i != nums.length-1) {
				if(nums[i] < target && nums[i+1] > target) {
					return target = i+1;
				}
			}
			else if(i == nums.length-1 && target > nums[i]) {
				return target = i+1;
				
			}
			else {
				return 0;
			}
		}

		return target = nums.length-1;
	}

}
