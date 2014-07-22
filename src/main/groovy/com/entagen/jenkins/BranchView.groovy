package com.entagen.jenkins

class BranchView {
    String templateJobPrefix
    String branchName

    public String getViewName() {
        if (templateJobPrefix == null)
            return "view-$safeBranchName"
        return "$templateJobPrefix-$safeBranchName"
    }

    public String getSafeBranchName() {
        return branchName.replaceAll('/', '_')
    }

    public String getViewRegex() {
        if (templateJobPrefix == null)
            return ".*$safeBranchName"
        return "$templateJobPrefix.*$safeBranchName"
    }

    public String toString() {
        return this.viewName
    }
}
