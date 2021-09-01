package kr.co.gardener.main.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/category")
public class CategoryController {
	final String path = "main/category/";
	
	//ī�װ�
	@RequestMapping({"/",""})
	public String category(Model model) {
		//productCategoryName(ǰ�� ī�װ� ��з���),
		//subProductCategoryList(productId(ǰ����̵�)�� subProductCategoryName(�ߺз� ī�װ���)�� ����ִ� ����Ʈ)
		//�� ����ִ� ǰ�� ��з� ����Ʈ �������ּ���.(����Ʈ �ȿ� ����Ʈ�� ����ִ°� �½��ϴ�^^)
		model.addAttribute("productCategoryList","productcategoryList");
		
		//brandName(�귣���)�� ����ִ� ����Ʈ �������ּ���.
		model.addAttribute("brnadList","brandList");
		return path + "category-list";
	}
	
	//ǰ�� ī�װ�
	@RequestMapping("/product")
	public String productlist(Model model) {
		//productId(ǰ�� ��ǰ���̵�), productImg(ǰ�� ��ǰ�̹���), 
		//productName(ǰ�� ��ǰ��)�� ����ִ� ����Ʈ �������ּ���.
		model.addAttribute("productList",new ArrayList<String>());
		return path + "product-list";
	}
	
	//�ش� ��ǰ�� ��������
	@RequestMapping("/product/{productId}")
	public String productdetail(@PathVariable int productId) {
		return path + "product-detail";
	}
	
	//�귣�庰 ī�װ�
	@RequestMapping("/brand")
	public String brandList(Model model) {
		//�귣�� �̸�
		model.addAttribute("brandName","brandName");
		//productId(�귣�庰 ��ǰ ���̵�), productImg(�귣�庰 ��ǰ�̹���)
		//productName(�귣�庰 ��ǰ��)�� ����ִ� ����Ʈ �������ּ���.
		model.addAttribute("brandProductList",new ArrayList<String>());
		return path + "brand-list";
	}
	
	//������ũ�� ī�װ�
	@RequestMapping("/mark")
	public String markList(Model model) {
		//����Ʈ �ΰ� ������ּ���
		//������ũ �̹��� ����Ʈ
		model.addAttribute("markImgList","markImgList");
		//������ũ �̸� ����Ʈ
		model.addAttribute("markNameList","markNameList");
		return path + "mark-list";
	}
}
