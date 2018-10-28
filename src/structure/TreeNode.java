package structure;

import javax.swing.tree.DefaultMutableTreeNode;

public class TreeNode extends DefaultMutableTreeNode {
	private static final long serialVersionUID = 123232323L;
	/* 当前结点类型 */
	private String nodeKind;
	/* 当前结点内容*/
	private String content;
	/* 当前结点所在行号*/
	private int lineNum;

	public TreeNode() {
		super();
		nodeKind = "";
		content = "";
	}

	public TreeNode(String content) {
		super(content);
		this.content = content;
		nodeKind = "";
	}

	public TreeNode(String kind, String content) {
		super(content);
		this.content = content;
		nodeKind = kind;
	}

	public TreeNode(String kind, String content,int lineNum) {
		super(content);
		this.content = content;
		this.lineNum = lineNum;
		nodeKind = kind;
	}

	public String getNodeKind() {
		return nodeKind;
	}

	public void setNodeKind(String nodeKind) {
		this.nodeKind = nodeKind;
	}

	public int getLineNum() {
		return lineNum;
	}

	public void setLineNum(int lineNum) {
		this.lineNum = lineNum;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
		setUserObject(content);
	}


	public void add(TreeNode childNode) {
		super.add(childNode);
	}

	public TreeNode getChildAt(int index) {
		return (TreeNode) super.getChildAt(index);
	}
	
}
