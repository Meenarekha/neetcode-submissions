class Solution:
    def simplifyPath(self, path):
        stack = []
        parts = path.split('/')
        for s in parts:
            if s == '' or s ==".":
                continue
            elif s=='..':
                if stack:
                    stack.pop()
            else:
                stack.append(s)
        
        result = ""
        for dir in stack:
            result += '/'+dir
        if result == '':
            return '/'
        return result
        