package com.rubypaper;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor*/
@Data
public class BoardVO {
	
	private int no;
	private String title;
	private String writer;
	private String content;
	private Date date;
	private int cnt;
}

