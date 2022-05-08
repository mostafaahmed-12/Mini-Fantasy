#include "Admin.h"
#include"System.h"
#include"User.h"
#include <cmath>
Admin::Admin()
{

}
//	cout << "\t\t 1. basic statistics       \t\t\t2.View available \n\t\t\t\t\t 3. Back" << endl;


void Admin::Statics()
{
	string number;
	cout << "\n\n\t\t\xB3\xB2=\xB2=\xB2-\xB3 VACCINE TRACKING SYSTEM  \xB3\xB2=\xB2=\xB2-\xB3\n\n" << endl;
	cout << "\n\t\t\t*****************************************\n";
	cout << "\t\t\t\tVACCINE STATISTICS";
	cout << "\n\t\t\t*****************************************\n\n";
	cout << "\t\t 1. basic statistics   \t\t\t2.AdvancedStatistics" << endl;
	cin >> number;
	if (number == "1") {
		this->basic_statistics();
	}

	else if (number == "2")
	{
		this->Addvanced_Statics();
	}


}


void Admin::view()
{
	string id;
	System s;
	cout << "\n\t\t\t************************************************************\n";
	cout << "\t\t\t\tviewing the records of user by his National Number";
	cout << "\n\t\t\t************************************************************\n\n";
	cout << "\t\t\t\t\n                                    THE NATIONAL NUMBER: "; cin >> id;
	cout << endl;

	if (s.users.find(id) != s.users.end()) {
		s.users[id].Display();
	}
	else
	{
		cout << " \n                                   Sorry User is not found" << endl;
	}



}

void Admin::basic_statistics()
{
	User u;
	cout << "Percentage of people registered in the system that has received the first dose is " << double(((double)u.vaccine.ones_count / ((double)u.vaccine.both_count + (double)u.vaccine.ones_count)) * 100.0) << "%" << endl;
	cout << endl;
	cout << "Percentage of people registered in the system that has received both doses is " << double(((double)u.vaccine.both_count / ((double)u.vaccine.both_count + (double)u.vaccine.ones_count)) * 100.0) << "%" << endl;

	cout << endl;
	cout << "Percentage of Females and Males registered in the system " << endl;
	cout << endl;
	if (isnan(double(((double)u.count_famale / ((double)u.count_famale + (double)u.count_male)) * 100.0))) {
		cout << "Famales " << 0 << " %" << endl;
	}
	else
	{
		cout << "Famales " << double(((double)u.count_famale / ((double)u.count_famale + (double)u.count_male)) * 100.0) << endl;

	}
	cout << endl;
	if (isnan(double(((double)u.count_male / ((double)u.count_famale + (double)u.count_male)) * 100.0))) {
		cout << "Males" << "0 %" << endl;
	}
	else
	{
		cout << "Males " << double(((double)u.count_male / ((double)u.count_famale + (double)u.count_male)) * 100.0) << endl;
	}
	cout << endl;
	if (isnan(double(((double)u.vaccine.one_dose_famale / ((double)u.vaccine.one_dose_famale + (double)u.vaccine.one_dose_male)) * 100.0))) {
		cout << "Percentage of Famales registered in the system that has received the first dose is " << 0 << " %" << endl;
	}
	else
	{
		cout << "Percentage of Famales registered in the system that has received the first dose is " << double(((double)u.vaccine.one_dose_famale / ((double)u.vaccine.one_dose_famale + (double)u.vaccine.one_dose_male)) * 100.0) << "%" << endl;

	}
	cout << endl;
	if (isnan(double(((double)u.vaccine.one_dose_male / ((double)u.vaccine.one_dose_famale + (double)u.vaccine.one_dose_male)) * 100.0))) {
		cout << "Percentage of Males registered in the system that has received the first dose is " << 0 << " %" << endl;
	}
	else
	{
		cout << "Percentage of Males registered in the system that has received the first dose is " << double(((double)u.vaccine.one_dose_male / ((double)u.vaccine.one_dose_famale + (double)u.vaccine.one_dose_male)) * 100.0) << "%" << endl;

	}
	cout << endl;
	if (isnan(double(((double)u.vaccine.both_dose_famale / ((double)u.vaccine.both_dose_famale + (double)u.vaccine.both_dose_male)) * 100.0))) {
		cout << "Percentage of Famales registered in the system that has received both doses is " << 0 << "%" << endl;
		cout << endl;
	}
	else
	{
		cout << "Percentage of Famales registered in the system that has received both doses is " << double(((double)u.vaccine.both_dose_famale / ((double)u.vaccine.both_dose_famale + (double)u.vaccine.both_dose_male)) * 100.0) << "%" << endl;
		cout << endl;
	}

	if (isnan(double(((double)u.vaccine.both_dose_male / ((double)u.vaccine.both_dose_famale + (double)u.vaccine.both_dose_male)) * 100.0))) {
		cout << "Percentage of Male registered in the system that has received both doses is " << 0 << "%" << endl;
	}
	else
	{
		cout << "Percentage of Male registered in the system that has received both doses is " << double(((double)u.vaccine.both_dose_male / ((double)u.vaccine.both_dose_famale + (double)u.vaccine.both_dose_male)) * 100.0) << "%" << endl;
		cout << endl;
	}

}

void Admin::Delete_AT_Admin()
{
	string id;
	cout << "\n\t\t\t************************************************************\n";
	cout << "\t\t\t\tDelete the records of user by his National Number";
	cout << "\n\t\t\t************************************************************\n\n";
	cout << "\t\t\t\t\n                                    THE NATIONAL NUMBER: "; cin >> id;
	cout << endl;
	while (true)
	{
		string x;
		cout << "\t""Press 1 to delete record Or 2 to delete this user:- "; cin >> x;
		if (x == "1") {
			//delte_record
		}
		else if (x == "2")
		{



		}

	}
}

void Admin::Addvanced_Statics()
{
	cout << "Wait i will make the impell";
}
