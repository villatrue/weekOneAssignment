package com.smoothstack.weekOneProject;

public class AuthorService {
	public String addAuthor(Author author){
		if(author == null) {
			return "Author name cannot be null";
		}else if(author.getAuthorName() !=null && author.getAuthorName().length() >3){
			return "Success";
		}
		return null;
	}
}
