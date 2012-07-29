//   Copyright 2012 Wesley Acheson
//
//   Licensed under the Apache License, Version 2.0 (the "License");
//   you may not use this file except in compliance with the License.
//   You may obtain a copy of the License at
//
//       http://www.apache.org/licenses/LICENSE-2.0
//
//   Unless required by applicable law or agreed to in writing, software
//   distributed under the License is distributed on an "AS IS" BASIS,
//   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//   See the License for the specific language governing permissions and
//   limitations under the License.

package com.wesley_acheson.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wesley_acheson.spring.BackingBean;

/**
 * An overly simplictic controller. Its basically just to prove the
 * {@link BackingBean} annotation works correctly.
 * 
 * @author Wesley Acheson
 * 
 */
@Controller("pageController")
@RequestMapping("THIS_SHOULDNT_MATCH_ANYTHING")
public class PageController {

	@RequestMapping
	public String doContents(@BackingBean Page bean, ModelMap modelMap) {
		modelMap.addAttribute("page", bean);
		return "/page.jsp";
	}
}
