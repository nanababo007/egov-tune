/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package egovframework.example.sample.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sample2")
public class EgovSampleController2 {

	@GetMapping("/list")
    public List<Map<String,Object>> getList(@PathVariable Long id) {
    	List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
        
    	Map<String,Object> row1 = new HashMap<String,Object>();
    	row1.put("row1_col1", "row1_value1");
    	row1.put("row1_col2", "row1_value2");

    	Map<String,Object> row2 = new HashMap<String,Object>();
    	row2.put("row2_col1", "row2_value1");
    	row2.put("row2_col2", "row2_value2");
    	
    	list.add(row1);
    	list.add(row2);
    	
    	System.out.println("api sample list :: ");
    	System.out.println(list);
    	
    	return list;
    }

}
