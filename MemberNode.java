import java.util.LinkedList;

public class MemberNode {
	public String name;
	public String pathToProfileImg;
	public MemberNode parent;
	private MemberNode partner;
	public LinkedList<MemberNode> children;

	public MemberNode(String nameArg) {
		name = nameArg;
	}

	public MemberNode(String nameArg, MemberNode parentNode) {
		name = nameArg;
		parent = parentNode;
	}

	public void addPartner(MemberNode partnerNode) {
		partnerNode.children = children;
		partner = partnerNode;
	}
}
