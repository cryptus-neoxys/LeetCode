class Solution {
    public int minPartitions(String n) {
        return Arrays.stream(n.split("")).mapToInt(Integer::parseInt).max().getAsInt();
    }
}