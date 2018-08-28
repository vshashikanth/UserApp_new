package com.dm_02_tbdapp.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Types;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.SqlLobValue;
import org.springframework.jdbc.support.lob.DefaultLobHandler;
import org.springframework.jdbc.support.lob.LobHandler;
import org.springframework.stereotype.Repository;

@Repository
public class ImageDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public String showImage() {
		
		//List persons=jdbcTemplate.query("select * from image where id=?",new Object[] {1},(resultSet,i)-> {
			//return toReport(resultSet); 
		//});
		
		return "showImage";
	}
	
	public String insertImage() {
		
	
	//System.out.println("hello this is insertImage() method."+jdbcTemplate);
		try {
		
			final File image= new File("C:\\Users\\shashi\\Downloads\\img\\shirt.png");
		    final InputStream imageIs=new FileInputStream(image);
		    LobHandler lobHandler= new DefaultLobHandler();
		    jdbcTemplate.update("insert into image (img_title,img_data) values(?,?)",
		    new Object[] {"shirt", new SqlLobValue(imageIs, (int)image.length(), lobHandler),},
		    new int[] {Types.VARCHAR,Types.BLOB});
	}catch(DataAccessException e) {
		System.out.println("exception occured "+e.getMessage());
	}catch(FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return "image";
	}
}
