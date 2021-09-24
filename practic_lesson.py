class Tree:

    def __init__(self):
        self.root = None

    def search (self, value ): # value-> 8
        found_node = self._search(self.root, value)
        if found_node == None:
            return False
        return True

    def delete(self, value):
        pass
    
    def max_value(self):
        pass

    def min_value(self):
        pass


    def insert(self,value):

        if self.root  is None:
            self.root = Node(value)
            return
        
        return self._insert(self.root, value)
        
    def _insert_with_search (self, value):
        found_node =self._search(self.root, value)

        # 2secenarios

    def _insert(self,  current_node, value):
        
        
        if value > current_node.value:
            if current_node.right is None:
                current_node.right = Node(value,current_node)
            return self._insert(current_node.right, value)
            
        
        else:
            if current_node.left is None:
                current_node.left = Node(value,current_node)
                return
            return self._insert( current_node.left, value)
        

    def _search (self, node_to_check, value ):
        # value = 15
        # node_to_check = 15
        if (    (node_to_check == None) or
        (node_to_check.value == value)
        ):
            return node_to_check
        
        if value > node_to_check.value:
            return self._search(node_to_check.right, value)
            
        else:
            # go left
            return self._search(node_to_check.left, value)
            


class Node:
    def __init__(self, value, parent =None):
        self.right = None
        self.left = None
        self.parent = None
        self.value = value

tree = Tree()
tree.insert(10)
tree.insert(8)
tree.insert(6)
tree.insert(5)
tree.insert(15)
tree.insert(7)

print(tree.search(10))
print(tree.search(8))
print(tree.search(6))
print(tree.search(5))
print(tree.search(16))
