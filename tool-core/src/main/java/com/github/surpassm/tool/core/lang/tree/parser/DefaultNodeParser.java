package com.github.surpassm.tool.core.lang.tree.parser;

import com.github.surpassm.tool.core.lang.tree.Tree;
import com.github.surpassm.tool.core.lang.tree.TreeNode;

/**
 * 默认的简单转换器
 *
 * @param <T> ID类型
 * @author liangbaikai
 */
public class DefaultNodeParser<T> implements NodeParser<TreeNode<T>, T> {

	@Override
	public void parse(TreeNode<T> object, Tree<T> treeNode) {
		treeNode.setId(object.getId());
		treeNode.setParentId(object.getParentId());
		treeNode.setWeight(object.getWeight());
		treeNode.setName(object.getName());

		//扩展字段
		// treeNode.extra("other",11);
		// treeNode.extra("other2",object.getXXX);
	}
}
