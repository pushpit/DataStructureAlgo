package Java.LeetCode.tree.serializeDeserialize.genrictree;

/**
 * Author: Nitin Gupta(nitin.gupta@walmart.com)
 * Date: 2019-07-29
 * Description:
 */
public interface ISerializeDeserializeNArrayTree {

    String NULL_INDICATOR = "$";
    String SEPARATOR = ",";

    String serialize(NArrayTreeNode root);

    NArrayTreeNode deserialize(String data);
}